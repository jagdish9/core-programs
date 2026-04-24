package programs.designpattern.behavioral.template;

public class TemplateMain {
    public static void main(String[] args) {
        OrderProcess order = new OnlineOrder();
        order.processOrder();
    }
}

//Workflow reused, steps customizable