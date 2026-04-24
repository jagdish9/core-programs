package programs.highleveldesign.interfacedrivendesign.dto;

public class ProductResult {
    private int finalQuantity;
    private double totalPrice;
    private boolean available;

    public ProductResult(int finalQuantity, double totalPrice, boolean available) {
        this.finalQuantity = finalQuantity;
        this.totalPrice = totalPrice;
        this.available = available;
    }

    public int getFinalQuantity() {
        return finalQuantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public boolean isAvailable() {
        return available;
    }
}
