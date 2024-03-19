package PubSubMessageQueueV1;

public interface Retry {
  void processWithRetry(RetryOperation operation);
}
