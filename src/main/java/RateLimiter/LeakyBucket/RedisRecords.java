package RateLimiter.LeakyBucket;

import RateLimiter.RateLimiter;

import java.util.HashMap;
import java.util.Map;

public class RedisRecords {
    Map<Integer, RateLimiter> userLimitMap;

     RedisRecords(){
        userLimitMap = new HashMap<>();
    }

    RateLimiter getBucket(int userId){
        if(!userLimitMap.containsKey(userId)){
            userLimitMap.put(userId, new LeakyBucket(10));
        }
        return userLimitMap.get(userId);
    }

    boolean accessApplication(int userId){
        RateLimiter usage = getBucket(userId);
        return usage.grantAccess();
    }
}
