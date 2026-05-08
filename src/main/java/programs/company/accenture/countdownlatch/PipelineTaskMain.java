package programs.company.accenture.countdownlatch;

public class PipelineTaskMain {

    private final PipelineTask loadLatch = new PipelineTask(1);
    private final PipelineTask processLatch = new PipelineTask(1);

    public void loadData() {
        System.out.println("Loading data...");
        sleep(3000);

        loadLatch.countDown();
    }

    public void processData() {
        try {
            loadLatch.await();
            System.out.println("Processing data...");
            sleep(3000);

            processLatch.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void saveData() {
        try {
            processLatch.await();
            System.out.println("Saving data...");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        PipelineTaskMain task = new PipelineTaskMain();

        Runnable r1 = task::loadData;
        Runnable r2 = task::processData;
        Runnable r3 = task::saveData;

        new Thread(r1).start();
        new Thread(r2).start();
        new Thread(r3).start();
    }

}
