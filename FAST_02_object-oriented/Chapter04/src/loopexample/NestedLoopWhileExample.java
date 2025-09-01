package loopexample;

public class NestedLoopWhileExample {
  public static void main(String[] args) {
    // 중첩된 while문을 이용한 구구단

    int dan = 2;
    int count;

    while (dan <= 9) {
      count = 1; // count를 다시 초기화 해줘야한다.
      while (count <= 9) {
        System.out.println(dan + " x " + count + " = " + dan*count);
        count++;
      }
      System.out.println();
      dan++;
    }

  }
}
