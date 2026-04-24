package programs.interfaceandabstractclass;

public abstract class Donation {

    abstract void pay();

    void submit() {
        System.out.println("submit()");
    }

    public Donation() {}
}
