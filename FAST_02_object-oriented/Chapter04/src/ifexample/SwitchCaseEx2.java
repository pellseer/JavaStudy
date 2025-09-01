package ifexample;

import java.util.Scanner;

public class SwitchCaseEx2 {
  public static void main(String[] args) {
    // 달을 입력받아 해당하는 달에 몇일이 있는지 알아내보자. 연습.
    // 1,3,5,7,8,10,12월은 31일, 2월은 28일, 4,6,9,11월은 30일로 구성되어 있다. 윤달은 제외한다.

    Scanner scanner = new Scanner(System.in);
    int month = scanner.nextInt();
    int day;

    switch (month) {
      case 1: case 3: case 5: case 7: case 8: case 10: case 12:
        day = 31;
        break;
      case 2:
        day = 28;
        break;
      case 4: case 6: case 9: case 11:
        day = 30;
        break;
      default:
        System.out.println("Error");
        day = 0;
    }

    System.out.println(month + "월은 " + day + "일입니다.");

  }
}
