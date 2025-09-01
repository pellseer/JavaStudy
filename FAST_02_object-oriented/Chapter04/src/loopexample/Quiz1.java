package loopexample;

public class Quiz1 {
  public static void main(String[] args) {
    // 구구단을 출력할 때 짝수 단만 출력하면서 단보다 곱하는 수가 작거나 같을 때까지만 출력하세요.

    int dan;
    int count;

    for (dan = 2; dan < 10; dan++) {
      if ((dan % 2)!=0)
        continue;

      for (count = 1; count < 10; count++) {
        if (dan < count)
          break; // 자기를 감싸고 있는 반복문만 빠져나간다. if문은 break문의 대상이 아니다.

        System.out.println(dan + " x " + count + " = " + dan*count);
      }

      System.out.println();
    }

  }
}
