package programs.company.atos;

public class InheritanceException {
}

class InExParent {

    public void show() throws Exception {
        System.out.println("show of InExParent");
    }
}

class InExChild extends InExParent {

    @Override
    public void show() throws RuntimeException {
        System.out.println("show of InExChild");
    }
}
