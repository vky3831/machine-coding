package PubSubMessageQueueV1;

public class RetryImpl implements Retry{

  int maxRetryLimit;

  public RetryImpl(int limit){
    this.maxRetryLimit = limit;
  }

  @Override
  public void processWithRetry(RetryOperation operation) {
    int retryCount = maxRetryLimit;
    while (retryCount >= 0){
      try{
        operation.execute();
      } catch (Exception e){
        retryCount -= 1;
        int retry = maxRetryLimit - retryCount;
        System.out.println("Retry: " + retry);
      }
    }
    if(retryCount < 0){
      System.out.println("Retry Exhausted. Unable to process message");
    }
  }
}
