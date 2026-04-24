package transaction;

import java.time.LocalDateTime;

public class Transaction {
    private String id;
    private String username;
    private int amount;
    private LocalDateTime time;

    public Transaction(String id, String username, int amount, LocalDateTime time) {
        this.id = id;
        this.username = username;
        this.amount = amount;
        this.time = time;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public int getAmount() {
        return amount;
    }

    public LocalDateTime getTime() {
        return time;
    }
}
