package RateLimiter.LeakyBucket;

import java.util.Timer;
import java.util.TimerTask;

public class PlayLeakyBucket {
    public static void main(String[] args) {
        RedisRecords redis = new RedisRecords();

        Timer timer = new Timer();
        class MyTask extends TimerTask {
            @Override
            public void run() {
                if(redis.accessApplication(1)){
                    System.out.println("Access granted");
                }else{
                    System.out.println("Too many requests");
                }
            }
        }
        timer.schedule(new MyTask(), 0, 1000);
        Thread consumerThread = new Consumer((LeakyBucket) redis.getBucket(1));
        consumerThread.start();
    }
}
