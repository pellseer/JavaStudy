package loopexample;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Quiz2 {
  public static void main(String[] args) {

    char operator = '+';
    int number1 = 10;
    int number2 = 5;
    int result = 0;

    Scanner scanner = new Scanner(System.in); // 기존 연산을 입력받아서
    String input = scanner.nextLine();
    operator = input.charAt(0);

    if (operator == '+') {
      result = number1 + number2;
    } else if (operator == '-') {
      result = number1 - number2;
    } else if (operator == '*') {
      result = number1 * number2;
    } else if (operator == '/') {
      result = number1 / number2;
    } else {
      System.out.println("잘못된 연산입니다.");
    }

    System.out.println(result);

  }
}
