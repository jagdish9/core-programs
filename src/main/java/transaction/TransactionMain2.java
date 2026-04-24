package transaction;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TransactionMain2 {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction("1", "U1", 200, LocalDateTime.now().minusDays(10)),
                new Transaction("2", "U2", 500, LocalDateTime.now().minusDays(15)),
                new Transaction("3", "U1", 300, LocalDateTime.now().minusDays(20)),
                new Transaction("4", "U3", 700, LocalDateTime.now().minusDays(25)),
                new Transaction("2", "U2", 500, LocalDateTime.now().minusDays(15)) // duplicate
        );

        LocalDateTime last30Days = LocalDateTime.now().minusDays(30);

        //Remove duplicates based on id
        List<Transaction> transactionList = transactions.stream()
                .collect(Collectors.toMap(Transaction::getId, Function.identity(), (t1, t2) -> t1))
                .values()
                .stream().toList();

        for(Transaction t : transactionList) {
            System.out.println(t.getId() + " "+ t.getUsername() + " "+t.getAmount() + " "+ t.getTime());
        }

        //Find the top 3 users who spent the most in that period
        List<String> usernameList = transactions.stream()
                .collect(Collectors.toMap(Transaction::getId, Function.identity(), (t1, t2) -> t1))
                .values()
                .stream()
                .filter(f -> f.getTime().isAfter(last30Days))
                .sorted(Comparator.comparing(Transaction::getAmount).reversed())
                .map(Transaction::getUsername)
                .limit(3)
                .toList();

        System.out.println(usernameList);

        //Group by userId and sum the amount
        Map<String, Integer> usersAndAmount = transactions.stream()
                .collect(Collectors.groupingBy(Transaction::getId, Collectors.summingInt(Transaction::getAmount)));
        usersAndAmount.forEach((k, v) -> {
            System.out.println(k + ": "+ v);
        });
    }
}
