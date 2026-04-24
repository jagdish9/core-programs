package transaction;

import java.time.LocalDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TransactionMain3 {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction("1", "U1", 200, LocalDateTime.now().minusDays(10)),
                new Transaction("2", "U2", 500, LocalDateTime.now().minusDays(15)),
                new Transaction("3", "U1", 300, LocalDateTime.now().minusDays(20)),
                new Transaction("4", "U3", 700, LocalDateTime.now().minusDays(25)),
                new Transaction("2", "U2", 500, LocalDateTime.now().minusDays(15)), // duplicate
                new Transaction("4", "U3", 900, LocalDateTime.now().minusDays(45)) // added to understand minus 30 days fun
        );

        LocalDateTime last30Days = LocalDateTime.now().minusDays(30);

        Map<String, Integer> map = transactions.stream()

                //Remove duplicate based on id
                .collect(Collectors.toMap(Transaction::getId, Function.identity(), (t1, t2) -> t1))
                .values()
                .stream()

                //consider transaction from the last 30 days
                .filter(f -> f.getTime().isAfter(last30Days))

                //Group by users and sum the amount
                .collect(Collectors.groupingBy(Transaction::getId, Collectors.summingInt(Transaction::getAmount)))
                .entrySet()
                .stream()

                //sort by amount
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())

                //top 3 users
                .limit(3)

                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue,
                        (o, n) -> o,
                        LinkedHashMap::new));

        map.forEach((k, v) -> {
            System.out.println(k + ": "+ v);
        });

    }
}
