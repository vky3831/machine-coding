package PubSubMessageQueueV1;

import java.util.ArrayList;
import java.util.List;

public class PubSubService {

  MessageQueue<Message> messageQueue;
  List<Subscriber> subscribers;

  Retry retry;

  public PubSubService(){
    messageQueue = new MessageQueue<>();
    subscribers = new ArrayList<>();
    retry = new RetryImpl(3);
  }

  void addSubscribers(Subscriber subscriber){
    subscribers.add(subscriber);
  }

  void removeSubscriber(Subscriber subscriber){
    subscribers.remove(subscriber);
  }

  void publishMessage(Message message){
    retry.processWithRetry(() -> {
      messageQueue.push(message);
      notifyAllSubscribers();
    });
  }

  private void notifyAllSubscribers() {
    Message message = messageQueue.peek();
    for(Subscriber subscriber : subscribers){
      if(message != null && !subscriber.getProcessedStatus()){
        subscriber.processMessage(message);
      }
    }

    for (Subscriber subscriber: subscribers){
      subscriber.setProcessedStatus(false);
    }

    messageQueue.pop();
  }

}
