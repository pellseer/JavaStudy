package loopexample;

import java.util.Scanner;

public class Quiz3 {
  public static void main(String[] args) {

    System.out.print("홀수를 입력해주세요 : ");

    Scanner scanner = new Scanner(System.in);

    int starCount = 1;
    int lineCount = scanner.nextInt();
    int spaceCount = lineCount/2 + 1;

    for (int i = 0; i < lineCount; i++) {
      for (int j = 0; j < spaceCount; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < starCount; j++) {
        System.out.print("*");
      }
      for (int j = 0; j < spaceCount; j++) {
        System.out.print(" ");
      }

      if (i < lineCount/2) {
        starCount += 2;
        spaceCount -= 1;
      } else {
        starCount -= 2;
        spaceCount += 1;
      }
      System.out.println();
    }

  }
}
