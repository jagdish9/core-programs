package programs.java8important;

import java.util.Collection;
import java.util.List;

public class FindTotalRevenue {
    public static void main(String[] args) {
        List<List<OrderC1>> orderList = List.of(List.of(
                new OrderC1(new OrderItem("Asus v1", 15000, 1)),
                new OrderC1(new OrderItem("Samsung v1", 20000, 1)),
                new OrderC1(new OrderItem("Oppo v1", 80000, 4)),
                new OrderC1(new OrderItem("MicroMax v2", 50000, 5))
        ),
                List.of(
                        new OrderC1(new OrderItem("Nokia v1", 10000, 1)),
                        new OrderC1(new OrderItem("One plus v1", 22000, 1)),
                        new OrderC1(new OrderItem("Vivo v1", 60000, 3))
                ));

        double totalRevenue = orderList.stream()
                .flatMap(order -> order.stream())
                        .mapToDouble(item -> item.getOrderItem().getPrice() * item.getOrderItem().getQuantity())
                .sum();

        System.out.println(totalRevenue);

        List<List<String>> strList = List.of(
                List.of("A", "B", "C", "D"),
                List.of("X", "Y", "Z", "W"),
                List.of("E", "F", "G", "H")
        );

        List<String> output = strList.stream()
                .flatMap(s -> s.stream())
                .toList();

        System.out.println(output);
    }
}

class OrderC1 {
    private OrderItem orderItem;

    public OrderC1(OrderItem orderItem) {
        this.orderItem = orderItem;
    }

    public OrderItem getOrderItem() {
        return orderItem;
    }
}

class OrderItem {
    private String itemName;
    private double price;
    private double quantity;

    public OrderItem(String itemName, double price, double quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public double getQuantity() {
        return quantity;
    }

    public String getItemName() {
        return itemName;
    }
}
