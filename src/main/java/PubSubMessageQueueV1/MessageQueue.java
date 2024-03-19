package PubSubMessageQueueV1;

public class MessageQueue<T> {
    Node<T> front;
    Node<T> rear;
    int size;

    public MessageQueue(){
      front = null;
      rear = null;
      size = 0;
    }

    void push(T value){
      if(front == null){
        front = new Node(value);
        rear = front;
      }else{
        rear.next = new Node(value);
        rear = rear.next;
      }
      size++;
    }

    T peek(){
      return front == null ? null : front.value;
    }

    void pop(){
      if(front == null) return;
      else if (front == rear) {
        front = rear = null;
        size = 0;
      }else{
        front = front.next;
        size--;
      }
    }

    boolean isEmpty(){
      return size == 0;
    }

    int getSize(){
      return size;
    }


}
