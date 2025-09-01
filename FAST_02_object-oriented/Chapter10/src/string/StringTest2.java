package string;

public class StringTest2 {

  public static void main(String[] args) {

    String java = new String("java");
    String android = new String("android");
    System.out.println(System.identityHashCode(java));
    System.out.println(System.identityHashCode(android));

    java = java.concat(android);
    System.out.println(java);

    System.out.println(System.identityHashCode(java)); // concat()으로 문자열 연결을 하더라도 새롭게 인스턴스를 생성

  }

}
