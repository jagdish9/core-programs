package programs.designpattern.structural.adapter;

public class PrinterAdapter implements Printer {

    OldPrinter oldPrinter = new OldPrinter();

    public void print() {
        oldPrinter.printOld();
    }
}
