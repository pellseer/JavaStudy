package ifexample;

import java.util.Scanner;

public class IfExample3 {
  public static void main(String[] args) {
    // 점수를 입력받아 학점을 정하는 프로그램 작성. 연습.

    Scanner scanner = new Scanner(System.in);

    System.out.print("점수를 입력해주세요 : ");
    int score = scanner.nextInt();
    char grade;

    if (score >= 90 && score <= 100) {
      grade = 'A';
    } else if (score >= 80) {
      grade = 'B';
    } else if (score >= 70) {
      grade = 'C';
    } else if (score >= 60) {
      grade = 'D';
    } else {
      grade = 'F';
    }

    System.out.println("점수 : " + score);
    System.out.println("학점 : " + grade);

  }
}
