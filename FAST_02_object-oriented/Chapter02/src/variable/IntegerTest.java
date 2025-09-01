package variable;

public class IntegerTest {
  public static void main(String[] args) {

    byte bs = 127;

    System.out.println(bs);

    //int iVal = 12345678900;환 // 범위 오버
    long lVal = 12345678900L; // L을 붙임으로서 long 으로 취급하라는 의미의 식별자
    long lVal2 = 100; // 4byte인 int 범위안에 들어가므로 Long으로 자동 형변
  }
}
