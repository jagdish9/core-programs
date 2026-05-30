package programs.algorithm.ratelimiter;

public class TokenBucketRateLimiter {

    private final long capacity;
    private final long refillTokensPerSecond;

    private double availableTokens;
    private long lastRefillTimestamp;

    public TokenBucketRateLimiter(long capacity, long refillTokensPerSecond) {
        this.capacity = capacity;
        this.refillTokensPerSecond = refillTokensPerSecond;
        this.availableTokens = capacity;
        this.lastRefillTimestamp = System.currentTimeMillis();
    }

    public synchronized boolean allowRequest() {
        refill();

        if(availableTokens >= 1) {
            availableTokens--;
            return true;
        }

        return false;
    }

    public void refill() {
        long currentTime = System.currentTimeMillis();

        long timeElapsed = currentTime - lastRefillTimestamp;

        double tokensToAdd = (timeElapsed / 1000.0) * refillTokensPerSecond;

        if(tokensToAdd > 0) {
            availableTokens = Math.min(capacity, availableTokens + tokensToAdd);
            lastRefillTimestamp = currentTime;
        }
    }

    public static void main(String[] args) {
        TokenBucketRateLimiter limiter = new TokenBucketRateLimiter(5, 1);

        for(int i = 1; i <= 10; i++) {
            boolean allowed = limiter.allowRequest();

            System.out.println(
                    "Request "+ i + " -> " + (allowed ? "Allowed" : "Rejected")
            );

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
