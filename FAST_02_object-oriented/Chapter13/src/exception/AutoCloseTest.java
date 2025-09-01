package exception;

public class AutoCloseTest {

  public static void main(String[] args) {

    AutoCloseObj obj = new AutoCloseObj();

    // 1.9 version 부터 선언 후 변수만 입력해도 가능
    try(obj) {
      throw new Exception();
    } catch (Exception e) {
      System.out.println(e);
    }

  }

}
