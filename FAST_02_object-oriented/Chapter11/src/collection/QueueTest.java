package collection;

import java.util.ArrayList;

class MyQueue {

  private ArrayList<String> arrayQueue = new ArrayList<String>();

  public void add(String data) {
    int length = arrayQueue.size();
    arrayQueue.add(length,data);
  }

  public String remove() {
    return arrayQueue.remove(0);
  }

}

public class QueueTest {

  public static void main(String[] args) {
    MyQueue queue = new MyQueue();

    queue.add("A");
    queue.add("B");
    queue.add("C");

    System.out.println(queue.remove());
    System.out.println(queue.remove());
    System.out.println(queue.remove());

  }

}
