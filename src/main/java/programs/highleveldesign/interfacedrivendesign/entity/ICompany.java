package programs.highleveldesign.interfacedrivendesign.entity;

public interface ICompany {
    void addProduct(IProduct product);
    IProduct getProduct(String productId);
}
