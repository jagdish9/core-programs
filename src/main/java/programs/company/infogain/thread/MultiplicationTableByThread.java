package programs.company.infogain.thread;

public class MultiplicationTableByThread {
    private int beginNumber = 1;
    private int endNumber = 50;

    private synchronized void printFor2() {
        while(beginNumber <= endNumber) {
            while(beginNumber % 2 != 0) {
                try {
                    wait();
                } catch(InterruptedException ie) {
                    ie.printStackTrace();
                }
            }

            if(beginNumber <= endNumber) {
                System.out.println("Number 2: "+ beginNumber);
                beginNumber++;
                notify();
            }
        }
    }

    private synchronized void printFor3() {
        while(beginNumber <= endNumber) {
            while(beginNumber % 3 != 0) {
                try {
                    wait();
                } catch(InterruptedException ie) {
                    ie.printStackTrace();
                }
            }

            if(beginNumber <= endNumber) {
                System.out.println("Number 3: "+ beginNumber);
                beginNumber++;
                notify();
            }
        }
    }

    private synchronized void printFor4() {
        while(beginNumber <= endNumber) {
            while(beginNumber % 4 != 0) {
                try {
                    wait();
                } catch(InterruptedException ie) {
                    ie.printStackTrace();
                }
            }

            if(beginNumber <= endNumber) {
                System.out.println("Number 4: "+ beginNumber);
                beginNumber++;
                notify();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MultiplicationTableByThread main = new MultiplicationTableByThread();
        Thread t1 = new Thread(() -> main.printFor2(), "t1");
        Thread t2 = new Thread(() -> main.printFor3(), "t2");
        Thread t3 = new Thread(() -> main.printFor4(), "t3");

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();
    }
}
