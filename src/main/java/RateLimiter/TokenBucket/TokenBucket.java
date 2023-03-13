package RateLimiter.TokenBucket;

import RateLimiter.RateLimiter;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class TokenBucket implements RateLimiter {

    int bucketCapacity;
    int refreshRate;
    AtomicInteger currentCapacity;
    AtomicLong lastUpdatedTime;

    TokenBucket(int bucketCapacity, int refreshRate){
        this.bucketCapacity = bucketCapacity;
        this.refreshRate = refreshRate;
        currentCapacity.getAndSet(bucketCapacity);
        lastUpdatedTime.getAndSet(System.currentTimeMillis());
    }

    void refreshBucket(){
        long currentTime = System.currentTimeMillis();
        int additionalTokens = (int)((currentTime - lastUpdatedTime.get())/1000)*refreshRate;
        currentCapacity.getAndSet(Math.min(bucketCapacity, currentCapacity.get()+additionalTokens));
        lastUpdatedTime.getAndSet(currentTime);
    }

    @Override
    public boolean grantAccess() {
        refreshBucket();
        if(currentCapacity.get() > 0 ){
            currentCapacity.decrementAndGet();
            return true;
        }
        return false;
    }
}
