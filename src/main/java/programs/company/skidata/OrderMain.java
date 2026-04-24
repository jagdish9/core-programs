package programs.company.skidata;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class OrderMain {
    public static void main(String[] args) {
        List<OrderObject> orders = Arrays.asList(
                new OrderObject("order-1", 12, 1000, LocalDateTime.now().minusDays(25)),
                new OrderObject("order-2", 22, 2000, LocalDateTime.now().minusDays(20)),
                new OrderObject("order-3", 32, 3000, LocalDateTime.now().minusDays(10)),
                new OrderObject("order-4", 42, 4000, LocalDateTime.now().minusDays(15)),
                new OrderObject("order-5", 52, 3000, LocalDateTime.now().minusDays(45)),
                new OrderObject("order-7", 62, 2000, LocalDateTime.now().minusDays(62)),
                new OrderObject("order-8", 72, 3000, LocalDateTime.now().minusDays(12)),
                new OrderObject("order-9", 82, 4000, LocalDateTime.now().minusDays(16)),
                new OrderObject("order-10", 92, 5000, LocalDateTime.now().minusDays(18)),
                new OrderObject("order-12", 102, 6000, LocalDateTime.now().minusDays(35)),
                new OrderObject("order-13", 112, 7000, LocalDateTime.now().minusDays(65)),
                new OrderObject("order-10", 122, 6000, LocalDateTime.now().minusDays(50)),
                new OrderObject("order-15", 132, 3000, LocalDateTime.now().minusDays(40)),
                new OrderObject("order-17", 142, 3500, LocalDateTime.now().minusDays(58)),
                new OrderObject("order-18", 32, 4000, LocalDateTime.now().minusDays(58)),
                new OrderObject("order-19", 62, 2000, LocalDateTime.now().minusDays(58))
        );

        //Find Top 5 users by total order value in last 60 days
       // LocalDateTime last60Days = LocalDateTime.now().minusDays(60);

        orders.stream()
                .filter(f -> f.getDate().isAfter(LocalDateTime.now().minusDays(60)))
                .collect(Collectors.groupingBy(
                        OrderObject::getOrderId,
                        Collectors.summingDouble(OrderObject::getAmount)
                ))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Double>comparingByValue(Collections.reverseOrder()))
                .map(Map.Entry::getKey)
                .limit(5)
                .toList()
                .forEach(System.out::println);

        System.out.println();

        orders.stream()
                .filter(f -> f.getDate().isAfter(LocalDateTime.now().minusDays(60)))
                .collect(Collectors.groupingBy(
                        OrderObject::getOrderId,
                        Collectors.summingDouble(OrderObject::getAmount)
                ))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Double>comparingByValue(Collections.reverseOrder()))
                .limit(5)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (o, n) -> o,
                        LinkedHashMap::new
                )).forEach((k, v) -> {
                    System.out.println(k + ": "+ v);
                });

        //Find toral order count per customer
        orders.stream()
                .collect(Collectors.groupingBy(
                        OrderObject::getUserId,
                        Collectors.counting()
                ))
                .forEach((k, v) -> {
                    System.out.println("UserId: "+k + " Order count: "+v);
                });

        System.out.println("--------------");
        //Find toral order value per customer
        orders.stream()
                .collect(Collectors.groupingBy(
                        OrderObject::getUserId,
                        Collectors.summingDouble(OrderObject::getAmount)
                ))
                .forEach((k, v) -> {
                    System.out.println("UserId: "+k + " Total order amount: "+v);
                });
    }
}
