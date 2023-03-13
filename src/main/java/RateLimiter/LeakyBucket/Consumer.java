package RateLimiter.LeakyBucket;

import java.util.Timer;
import java.util.TimerTask;

public class Consumer extends Thread{
    LeakyBucket bucket;
    Consumer(LeakyBucket bucket){
        this.bucket = bucket;
    }
    Timer timer = new Timer();
    class MyTask extends TimerTask{
        @Override
        public void run() {
            bucket.pollTask();
        }
    }
    @Override
    public void run() {
        timer.schedule(new MyTask(), 0, 2000);
    }
}
