package com.mycompany.mavenproject1.system_design;

public class RateLimiter {
    private final long capacity;
    private final long refillRate;
    private double tokens;
    private long lastRefillTimestamp;

    public RateLimiter(long capacity, long refillRate){
        this.capacity = capacity;
        this.refillRate = refillRate;
        this.tokens = capacity;
        this.lastRefillTimestamp = System.nanoTime();
    }

    public synchronized boolean allowRequest(){
        refill();
        // checks if the bucket has any tokens left
        if (tokens>=1){
            tokens-=1;
            return true;
        }
        return false;
    }

    private void refill(){
        long now = System.nanoTime();
        long elapsedTIme = now-lastRefillTimestamp;
        long tokensToAdd = (long) (elapsedTIme/1e9) * refillRate;
        if (tokensToAdd>0){
            tokens = Math.min(capacity, tokens + tokensToAdd);
            lastRefillTimestamp = now;
        }
    }
}
