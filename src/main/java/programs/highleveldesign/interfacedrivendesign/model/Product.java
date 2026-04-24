package programs.highleveldesign.interfacedrivendesign.model;

import programs.highleveldesign.interfacedrivendesign.dto.ProductResult;
import programs.highleveldesign.interfacedrivendesign.entity.IProduct;
import programs.highleveldesign.interfacedrivendesign.entity.IUser;

public class Product implements IProduct {
   private String productId;
   private int stock;
   private double pricePerUnit;

    public Product(String productId, int stock, double pricePerUnit) {
        this.productId = productId;
        this.stock = stock;
        this.pricePerUnit = pricePerUnit;
    }

    @Override
    public String getProductId() {
        return productId;
    }

    @Override
    public ProductResult calculate(IUser user) {
        int requestedQuantity = user.requestQuantity();

        //check availability
        boolean isAvailable = requestedQuantity <= stock;

        int finalQuantity = Math.min(requestedQuantity, stock);

        //pricing logic
        double totalPrice = finalQuantity * pricePerUnit;

        //bulk discount
        if(finalQuantity > 10) {
            totalPrice *= 0.9;
        }

        return new ProductResult(finalQuantity, totalPrice, isAvailable);
    }
}
