package variable;

public class CharTest {
  public static void main(String[] args) {

    char ch = 'A';

    System.out.println(ch);
    System.out.println((int)ch); // Type Casting

    int iCh = 66;

    System.out.println(iCh);
    System.out.println((char) iCh);

//    char ch2 = -66; // 음수 값은 들어갈 수 없다.

      char hangul = '\uAC00'; // 유니코드를 넣을때는 \\u 를 앞에다 붙이고
      System.out.println(hangul);

      char ch2 = '한';
  }
}
