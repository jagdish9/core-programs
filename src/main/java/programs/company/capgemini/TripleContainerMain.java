package programs.company.capgemini;

public class TripleContainerMain {
    public static void main(String[] args) {
        TripleContainer<String, Integer, Double> container =
                new TripleContainer<>("Hello", 45, 10.0);

        System.out.println(container.getValue1());
        System.out.println(container.getValue2());
        System.out.println(container.getValue3());
    }
}
