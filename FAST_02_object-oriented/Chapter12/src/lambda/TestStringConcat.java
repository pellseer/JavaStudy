package lambda;

public class TestStringConcat {

  public static void main(String[] args) {

    StringConImpl impl = new StringConImpl();
    impl.makeString("Hello", "World");

    // StringConImpl 클래스를 선언할 필요가 없다.
    StringConcat concat = (s, v) -> System.out.println(s + "," + v);
    concat.makeString("Hello", "World");

    // 내부적으론 람다식은 익명 클래스로 선언된다.
    StringConcat concat2 = new StringConcat() {

      @Override
      public void makeString(String s1, String s2) {
        System.out.println(s1 + "," + s2);
      }

    };

    concat2.makeString("Hello", "World");

  }

}
