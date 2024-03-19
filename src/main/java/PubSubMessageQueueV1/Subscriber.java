package PubSubMessageQueueV1;

import java.util.List;

public class Subscriber {
  String regex;
  Callback callback;
  boolean isProcessed;
  List<Subscriber> dependencies;

  public void processMessage(Message message){
    processMessageForDependencies(message);
    if(this.regex.equalsIgnoreCase(message.regex)){
      callback.startProcessing(message);
    }
    isProcessed = true;
  }

  private void processMessageForDependencies(Message message) {
    for(Subscriber subs : dependencies){
      subs.processMessage(message);
    }
  }

  public void setProcessedStatus(boolean status){
    this.isProcessed = status;
  }

  public boolean getProcessedStatus(){
    return isProcessed;
  }
}
