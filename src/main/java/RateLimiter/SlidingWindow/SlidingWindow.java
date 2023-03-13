package RateLimiter.SlidingWindow;

import RateLimiter.RateLimiter;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class SlidingWindow implements RateLimiter {
    int windowCapacity;
    int timeWindowFrameInSecond;
    Queue<Long> slidingWindow;

    SlidingWindow(int windowCapacity, int timeframe){
        this.windowCapacity = windowCapacity;
        this.timeWindowFrameInSecond = timeframe;
        slidingWindow = new ConcurrentLinkedQueue<Long>();
    }


    @Override
    public boolean grantAccess() {
        long currTime = System.currentTimeMillis();
        updateSlidingWindow(currTime);
        if(slidingWindow.size() < windowCapacity){
            slidingWindow.add(currTime);
            return true;
        }
        return false;
    }

    private void updateSlidingWindow(long currTime) {
        if(slidingWindow.isEmpty()) return;
        int timegap = (int) (currTime - slidingWindow.peek())/1000;
        while(timegap >= timeWindowFrameInSecond){
            slidingWindow.poll();
            if(slidingWindow.isEmpty()) return;
            timegap = (int) (currTime - slidingWindow.peek())/1000;
        }
    }
}
