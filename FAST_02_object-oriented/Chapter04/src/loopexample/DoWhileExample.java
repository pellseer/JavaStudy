package loopexample;

public class DoWhileExample {
  public static void main(String[] args) {

    int number = 1;
    int sum = 0;

    do {
      sum += number;
      number++;
    } while (number <= 10);

    System.out.println(sum);
    System.out.println(number);

  }
}
