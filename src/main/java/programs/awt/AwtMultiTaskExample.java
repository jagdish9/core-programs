package programs.awt;

import java.awt.*;

public class AwtMultiTaskExample {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT Multitasking");

        Button button = new Button("Start task");

        button.addActionListener(e -> {
            new Thread (() -> {
                System.out.println("Task started...");
                try {
                    Thread.sleep(5000); //simulate longer task
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
                System.out.println("Task completed!");
            }).start();
        });

        frame.add(button);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }
}
