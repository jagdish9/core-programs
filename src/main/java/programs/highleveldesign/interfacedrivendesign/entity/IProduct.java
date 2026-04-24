package programs.highleveldesign.interfacedrivendesign.entity;

import programs.highleveldesign.interfacedrivendesign.dto.ProductResult;

public interface IProduct {
    String getProductId();
    ProductResult calculate(IUser user);
}
