package lambda;

interface PrintString {
  void showString(String str);
}

public class TestLambda {

  public static void main(String[] args) {

    // 함수 구현부 변수에 대입
    PrintString lambdaStr = s -> System.out.println(s);
    lambdaStr.showString("Test");

    showMyString(lambdaStr);

    PrintString test = returnString();
    test.showString("Test3");

  }

  // 구현부를 매개변수로 사용
  public static void showMyString(PrintString p) {
    p.showString("Test2");
  }

  // 구현부를 리턴으로 전달
  public static PrintString returnString() {
    return s -> System.out.println(s + "!!!");
  }

}
