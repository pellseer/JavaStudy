package ifexample;

public class IfExample1 {
  public static void main(String[] args) {

    char gender = 'M';

    if (gender == 'F') { // statement 하나여도 중괄호를 사용하는것이 좋다.
      System.out.println("여성입니다."); // 블록이 시작되면 반드시 들여쓰기.
    } else {
      System.out.println("여성이 아닙니다.");
    }

  }
}
