package ifexample;

import java.util.Scanner;

public class IfExample2 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in); // 입력을 받기위한 Scanner 클래스, System.in은 입력용 스트림
    int age = scanner.nextInt(); // 직접 입력받은 값을 age 변수에 저장.

    int charge = 0;

    if (age < 8) { // 나이별 입장료
      charge = 1000;
      System.out.println("미취학 아동");
    } else if (age < 14) {
      charge = 1500;
      System.out.println("초등생");
    } else if (age < 20) {
      charge = 2000;
      System.out.println("중고등생");
    } else {
      charge = 3000;
      System.out.println("성인");
    }

    System.out.println("나이 : " + age);
    System.out.println("요금 : " + charge);

  }
}
