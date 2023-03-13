package RateLimiter.LeakyBucket;

import RateLimiter.RateLimiter;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class LeakyBucket implements RateLimiter {
    BlockingQueue<Integer> queue;

    LeakyBucket(int size){
        queue = new LinkedBlockingDeque<>(size);
    }

    void pollTask(){
        queue.poll();
    }



    @Override
    public boolean grantAccess() {
        if(queue.remainingCapacity() > 0){
            queue.add(1);
            System.out.println(queue.size());
            return true;
        }
        System.out.println(queue.size());
        return false;
    }
}
