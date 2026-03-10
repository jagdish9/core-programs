package programs.company.infogain.ratelimit;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class RateLimiterByConcurrent {
    public static void main(String[] args) throws InterruptedException {
        FixedWindowsRateLimiter fixedWindowsRateLimiter = new FixedWindowsRateLimiter(5);

        for (int i = 1; i <= 10; i++) {
            System.out.println("Request "+ i + " allowed: "+ fixedWindowsRateLimiter.allowRequest());
            Thread.sleep(100);
        }
    }
}

class FixedWindowsRateLimiter {
    private final int maxRequests;
    private final AtomicInteger counter;
    private final ScheduledExecutorService scheduledExecutorService;

    public FixedWindowsRateLimiter(int maxRequests) {
        this.maxRequests = maxRequests;
        this.counter = new AtomicInteger(0);
        this.scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();

        //Reset counter every 1 second
        scheduledExecutorService.scheduleAtFixedRate(() -> {
            counter.set(0);
        }, 1, 1, TimeUnit.SECONDS);
    }

    public boolean allowRequest() {
        return counter.incrementAndGet() <= maxRequests;
    }
}

//design rate limiter (max 5 request per second) using java concurrency
