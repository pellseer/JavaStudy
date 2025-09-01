package string;

public class StringTest {

  public static void main(String[] args) {

    String str1 = new String("abc");
    String str2 = new String("abc");

    System.out.println(str1 == str2); // new로 생성하면 Heap 메모리에 생성되므로 서로 다른 객체

    String str3 = "abc";
    String str4 = "abc";

    System.out.println(str3 == str4); // new를 사용안하면 리터럴(상수풀)에 있는 값 을 가져다 쓴다.

  }

}
