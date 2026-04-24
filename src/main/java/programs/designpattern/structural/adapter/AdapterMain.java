package programs.designpattern.structural.adapter;

public class AdapterMain {
    public static void main(String[] args) {
        Printer print = new PrinterAdapter();
        print.print();
    }
}

//Old system reused
