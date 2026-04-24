package transaction;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.*;

public class TransactionMain {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction("1", "U1", 200, LocalDateTime.now().minusDays(10)),
                new Transaction("2", "U2", 500, LocalDateTime.now().minusDays(15)),
                new Transaction("3", "U1", 300, LocalDateTime.now().minusDays(20)),
                new Transaction("4", "U3", 700, LocalDateTime.now().minusDays(25)),
                new Transaction("2", "U2", 500, LocalDateTime.now().minusDays(15)) // duplicate
        );

        List<Transaction> transaction = transactions.stream()
                .sorted(Comparator.comparing(Transaction::getId))
                .distinct()
                .toList();

        for(Transaction t : transaction) {
            System.out.println(t.getId() + " "+ t.getUsername() + " "+t.getAmount() + " "+ t.getTime());
        }

        System.out.println();

        List<String> top3Users = transactions.stream()
                .sorted(Comparator.comparing(Transaction::getTime).reversed())
                .map(m -> m.getUsername())
                .distinct()
                .limit(3)
                .toList();

        System.out.println(top3Users);
    }
}
