package loopexample;

public class BreakExample {
  public static void main(String[] args) {
    // 1부터 몇가지 더해야 합이 100을 넘지않을까.

    int sum = 0;
    int num;

    for (num = 1; ; num++) {
      sum += num;
      if (sum >= 100)
        break;
    }

    System.out.println(sum);
    System.out.println(num);

  }
}
