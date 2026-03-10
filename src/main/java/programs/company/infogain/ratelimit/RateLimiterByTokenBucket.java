package programs.company.infogain.ratelimit;

import java.util.concurrent.locks.ReentrantLock;

public class RateLimiterByTokenBucket {
    public static void main(String[] args) throws InterruptedException {
        TokenBucketRateLimiter tokenBucketRateLimiter =
                new TokenBucketRateLimiter(5, 5); // 5 per second

        for(int i = 1; i <= 10; i++) {
            System.out.println("Request "+ i + " allowed: "+ tokenBucketRateLimiter.allowRequest());
            Thread.sleep(100);
        }
    }
}

class TokenBucketRateLimiter {
    private final int capacity;
    private final int refillRate;
    private double tokens;
    private long lastRefillTimeStamp;
    private final ReentrantLock lock = new ReentrantLock();

    public TokenBucketRateLimiter(int capacity, int refillRate) {
        this.capacity = capacity;
        this.refillRate = refillRate;
        this.tokens = capacity;
        this.lastRefillTimeStamp = System.nanoTime();
    }

    public boolean allowRequest() {
        lock.lock();
        try {
            refillTokens();

            if(tokens >= 1) {
                tokens -= 1;
                return true;
            }
            return false;
        } finally {
            lock.unlock();
        }
    }

    private void refillTokens() {
        long now = System.nanoTime();
        double seconds = (now - lastRefillTimeStamp) / 1_000_000_000.0;

        double tokenToAdd = seconds * refillRate;

        if(tokenToAdd > 0) {
            tokens = Math.min(capacity, tokens + tokenToAdd);
            lastRefillTimeStamp = now;
        }
    }
}