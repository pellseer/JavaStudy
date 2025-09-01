package loopexample;

public class WhileExample {
  public static void main(String[] args) {

    int number = 1;
    int sum = 0;

    while (number <= 10) { // 1부터 10까지의 합
      sum += number;
      number++;
    }

    System.out.println(sum);
    System.out.println(number);

  }
}
