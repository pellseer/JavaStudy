package loopexample;

public class NestedLoopForExample {
  public static void main(String[] args) {
    // 중첩된 for문을 이용한 구구단

    int dan;
    int count;

    for (dan = 2; dan <= 9; dan++) {
      for (count = 1; count <= 9; count++) {
        System.out.println(dan + " x " + count + " = " + dan*count);
      }
      System.out.println();
    }

  }
}
