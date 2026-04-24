package programs.highleveldesign.interfacedrivendesign.model;

import programs.highleveldesign.interfacedrivendesign.entity.ICompany;
import programs.highleveldesign.interfacedrivendesign.entity.IProduct;

import java.util.HashMap;
import java.util.Map;

public class Company implements ICompany {
    private Map<String, IProduct> productMap = new HashMap<>();

    @Override
    public void addProduct(IProduct product) {
        productMap.put(product.getProductId(), product);
    }

    @Override
    public IProduct getProduct(String productId) {
        return productMap.get(productId);
    }
}
