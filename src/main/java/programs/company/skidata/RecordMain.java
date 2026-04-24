package programs.company.skidata;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RecordMain {
    public static void main(String[] args) {
        List<Record> records = Arrays.asList(
                new Record("1", "U1", 200, LocalDateTime.now().minusDays(10)),
                new Record("2", "U2", 500, LocalDateTime.now().minusDays(15)),
                new Record("3", "U1", 300, LocalDateTime.now().minusDays(20)),
                new Record("4", "U3", 700, LocalDateTime.now().minusDays(25)),
                new Record("5", "U4", 700, LocalDateTime.now().minusDays(28)),
                new Record("6", "U5", 700, LocalDateTime.now().minusDays(25)),
                new Record("2", "U6", 900, LocalDateTime.now().minusDays(35)),
                new Record("5", "U7", 1000, LocalDateTime.now().minusDays(45)),
                new Record("7", "U8", 1200, LocalDateTime.now().minusDays(12)),
                new Record("8", "U9", 1500, LocalDateTime.now().minusDays(60))
        );

        //Top N users by total transaction amount, N = 3
        records.stream()
                .collect(Collectors.groupingBy(
                        Record::getId,
                        Collectors.summingDouble(Record::getAmount)
                ))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Double>comparingByValue(Collections.reverseOrder()))
                .limit(3)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);

        //Group transaction by month
        Map<Month, List<Record>> groupByMonth = records.stream()
                .collect(Collectors.groupingBy(
                        t -> t.getTime().getMonth()
                ));

        groupByMonth.forEach((k, v) -> {
            System.out.println("Month: "+k.name());
            v.forEach(r -> System.out.println(r.getId() + " "+r.getUsername()));
        });
    }
}
