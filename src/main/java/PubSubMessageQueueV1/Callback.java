package PubSubMessageQueueV1;

public interface Callback {
  void startProcessing(Message message);
}
