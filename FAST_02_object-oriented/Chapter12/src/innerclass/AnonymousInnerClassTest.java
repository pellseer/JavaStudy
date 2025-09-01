package innerclass;

class OuterTwo {

  int outNum = 100;
  static int sNum = 200;

  // Anonymous Inner Class
  Runnable getRunnable(int i) {
    int num = 100;

    return new Runnable() {
      @Override
      public void run() {
//        num += 10; // getRunnable()의 지역 변수는 상수가 되기 때문에 변경은 불가
//        i = 200;
        System.out.println(num);
        System.out.println(i);
        System.out.println(outNum);
        System.out.println(Outer.sNum);
      }
    };
  }

  // Anonymous Inner Class
  Runnable runnable = new Runnable() {
    @Override
    public void run() {
      System.out.println("test");
    }
  };

}

public class AnonymousInnerClassTest {

  public static void main(String[] args) {

    OuterTwo outer = new OuterTwo();
    outer.runnable.run();
    Runnable runnable = outer.getRunnable(50);

    runnable.run();

  }

}
