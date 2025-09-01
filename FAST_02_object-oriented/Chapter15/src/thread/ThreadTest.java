package thread;

class MyThread implements Runnable {

  @Override
  public void run() {
    int i;

    for (i = 0; i <= 200; i++) {
      System.out.print(i + "\t");

      try {
        // sleep(100); // extends Thread 시에
        Thread.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

    }
  }

}

public class ThreadTest {

  public static void main(String[] args) {

    System.out.println("start");

    /* extends Thread
    MyThread th1 = new MyThread();
    MyThread th2 = new MyThread();

    th1.start();
    th2.start();
     */

    /* implements Runnable
    MyThread runner1 = new MyThread();
    Thread th1 = new Thread(runner1);
    th1.start();

    MyThread runner2 = new MyThread();
    Thread th2 = new Thread(runner2);
    th2.start();
     */

    Thread t = Thread.currentThread();
    System.out.println(t);

    System.out.println("end");

  }

}
