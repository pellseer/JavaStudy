package string;

public class StringBuilderTest {

  public static void main(String[] args) {

    String java = new String("java");
    String android = new String("android");

    System.out.println(System.identityHashCode(java));

    StringBuilder buffer = new StringBuilder(java);
    buffer.append("android");

    java = buffer.toString(); // toString()으로 String 반환

    System.out.println(System.identityHashCode(java));

  }

}
