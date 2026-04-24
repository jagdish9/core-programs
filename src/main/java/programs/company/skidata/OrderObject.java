package programs.company.skidata;

import java.time.LocalDateTime;

public class OrderObject {
    private String orderId;
    private int userId;
    private double amount;
    private LocalDateTime date;

    public OrderObject(String orderId, int userId, double amount, LocalDateTime date) {
        this.orderId = orderId;
        this.userId = userId;
        this.amount = amount;
        this.date = date;
    }

    public String getOrderId() {
        return orderId;
    }

    public int getUserId() {
        return userId;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDateTime getDate() {
        return date;
    }
}
