package innerclass;

class Outer {

  int outNum = 100;
  static int sNum = 200;

  Runnable getRunnable(final int i) {
    final int num = 100; // Local Inner Class 에서는 상수가 된다. final을 명시하지 않아도.
    class MyRunnable implements Runnable { // Local Inner Class

      @Override
      public void run() {
//        num += 10; // getRunnable()의 지역 변수는 상수가 되기 때문에 변경은 불가
//        i = 200;
        System.out.println(num);
        System.out.println(i);
        System.out.println(outNum);
        System.out.println(Outer.sNum);
      }

    }

    return new MyRunnable();
  };

}

public class LocalInnerClassTest {

  public static void main(String[] args) {

    Outer outer = new Outer();
    Runnable runnable = outer.getRunnable(50);

    runnable.run();

  }

}
