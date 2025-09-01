package interfaceex;

public interface Calc {

  double PI = 3.14; // Compile 시에 public static final 이 자동으로 붙는다.
  int ERROR = -999999999;

  int add(int num1, int num2);
  int substract(int num1, int num2);
  int times(int num1, int num2);
  int divide(int num1, int num2);

  default void description() {
    System.out.println("정수 계산기를 구현합니다.");
    myMethod();
  }

  static int total(int[] arr) {
    int total = 0;

    for (int i : arr) {
      total += i;
    }

    myStaticMethod();
    return total;
  }

  private void myMethod() { // private 메서드는 자바 9버전부터 사용가능
    System.out.println("private method");
  }

  private static void myStaticMethod() {
    System.out.println("private method");
  }

}
