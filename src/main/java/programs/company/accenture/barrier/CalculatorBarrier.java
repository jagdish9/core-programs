package programs.company.accenture.barrier;

import java.util.concurrent.CyclicBarrier;

public class CalculatorBarrier {
    private static int addResult;
    private static int mulResult;
    private static int subtractResult;

    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3, () -> {
            int result = addResult + mulResult + subtractResult;
            System.out.println("Final result: "+result);
        });

        System.out.println(barrier.getParties());

        new Thread(() -> {
            addResult = 5 + 4;
            System.out.println("Add done: " + Thread.currentThread().getName());
            await(barrier);
        }).start();

        new Thread(() -> {
            mulResult = 2 * 3;
            System.out.println("Multiply done: "+ Thread.currentThread().getName());
            await(barrier);
        }).start();

        Runnable t3 = () -> {
            subtractResult = 10 - 4;
            System.out.println("Subtract done: "+ Thread.currentThread().getName());
            await(barrier);
        };

        new Thread(t3).start();
    }

    private static void await(CyclicBarrier barrier) {
        try {
            barrier.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
