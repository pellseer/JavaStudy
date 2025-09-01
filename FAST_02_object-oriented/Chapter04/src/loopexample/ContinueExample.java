package loopexample;

public class ContinueExample {
  public static void main(String[] args) {

    int num;
    for (num = 1; num <= 100; num++) {
      if ((num%3) != 0) // 3의 배수가 아니면 continue
        continue;
      System.out.println(num);
    }

  }
}
