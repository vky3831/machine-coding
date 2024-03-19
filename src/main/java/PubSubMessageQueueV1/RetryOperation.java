package PubSubMessageQueueV1;

@FunctionalInterface
public interface RetryOperation {
 void execute();
}
