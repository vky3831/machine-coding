package PubSubMessageQueueV1;

public class Message {
  String regex;
  String payload;

  public Message(String regex, String payload){
    this.regex = regex;
    this.payload = payload;
  }

}
