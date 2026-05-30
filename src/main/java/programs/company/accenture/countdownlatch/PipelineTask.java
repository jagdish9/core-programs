package programs.company.accenture.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class PipelineTask extends CountDownLatch {

    public PipelineTask(int count) {
        super(count);
    }

}
