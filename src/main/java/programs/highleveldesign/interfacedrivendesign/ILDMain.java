package programs.highleveldesign.interfacedrivendesign;

import programs.highleveldesign.interfacedrivendesign.dto.ProductResult;
import programs.highleveldesign.interfacedrivendesign.entity.ICompany;
import programs.highleveldesign.interfacedrivendesign.entity.IProduct;
import programs.highleveldesign.interfacedrivendesign.entity.IUser;
import programs.highleveldesign.interfacedrivendesign.model.Company;
import programs.highleveldesign.interfacedrivendesign.model.Product;
import programs.highleveldesign.interfacedrivendesign.model.User;

public class ILDMain {
    public static void main(String[] args) {
        ICompany company = new Company();

        IProduct product = new Product("P1", 50, 100);

        company.addProduct(product);

        IUser user = new User("U1", 12);

        IProduct selectedProduct = company.getProduct("P1");

        ProductResult result = selectedProduct.calculate(user);

        System.out.println("Final Quantity: "+ result.getFinalQuantity());
        System.out.println("Total Price: "+ result.getTotalPrice());
        System.out.println("Available: "+ result.isAvailable());
    }
}
