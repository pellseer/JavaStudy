package variable;

public class BooleanTest {
  public static void main(String[] args) {

    boolean isMarried = false;

    System.out.println(isMarried);

    var i = 10; // Java 10 version 부터 제공되는 기능으로 컴파일러가 자료형을 추측하여 지정함
    System.out.println(i);

  }
}
