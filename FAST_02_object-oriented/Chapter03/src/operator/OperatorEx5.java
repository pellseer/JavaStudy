package operator;

public class OperatorEx5 {
  public static void main(String[] args) {

    // 비트 연산자
    int num1 = 0B00001010; // 10
    int num2 = 0B00000101; // 5

    System.out.println(num1&num2); // AND, 논리곱
    System.out.println(num1|num2); // OR, 논리합
    System.out.println(num1^num2); // XOR

    System.out.println(num2 << 3); // 1만큼 shift 할때마다 2씩 곱해진다.
    System.out.println(num2 >> 1); // 1만큼 shift 할때마다 2씩 나눠진다.

  }
}
