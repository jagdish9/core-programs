package programs.singleton;

public class BillPughSingleton {

    private BillPughSingleton() {}

    private static class Holder {
        private static final BillPughSingleton instance = new BillPughSingleton();
    }

    public BillPughSingleton getInstance() {
        return Holder.instance;
    }
}
