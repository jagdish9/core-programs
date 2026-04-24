package programs.highleveldesign.interfacedrivendesign.model;

import programs.highleveldesign.interfacedrivendesign.entity.IUser;

public class User implements IUser {
    private String userId;
    private int quantity;

    public User(String userId, int quantity) {
        this.userId = userId;
        this.quantity = quantity;
    }

    @Override
    public String getUserId() {
        return userId;
    }

    @Override
    public int requestQuantity() {
        return quantity;
    }
}
