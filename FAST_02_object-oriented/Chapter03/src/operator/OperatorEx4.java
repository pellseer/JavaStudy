package operator;

public class OperatorEx4 {
  public static void main(String[] args) {

    int num1 = 10;
    int i = 2;

    // 단락 회로 평가
//    boolean value = ( (num1 = num1 + 10) < 10) && ((i = i+2) < 10); // 앞에서의 계산으로만 결과가 나오기 때문에 뒤에는 계산하지 않는다.
//    boolean value = ( (num1 = num1 + 10) < 10) || ((i = i+2) < 10);
    boolean value = ( (num1 = num1 + 10) > 10) && ((i = i+2) < 10);
    System.out.println(num1);
    System.out.println(i);

    System.out.println(value);

    int num2 = 10;
    int num3 = 20;

    int max = (num2 > num3) ? num2:num3; // 삼항연산자
    System.out.println(max);

  }
}
