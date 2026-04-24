package programs.company.skidata;

import java.time.LocalDateTime;

public class Record {
    private String id;
    private String username;
    private double amount;
    private LocalDateTime time;

    public Record(String id, String username, double amount, LocalDateTime time) {
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

    public double getAmount() {
        return amount;
    }

    public LocalDateTime getTime() {
        return time;
    }
}
