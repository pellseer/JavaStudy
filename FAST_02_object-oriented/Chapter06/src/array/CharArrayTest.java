package array;

public class CharArrayTest {

  public static void main(String[] args) { // 알파벳 A 부터 Z까지 문자 배열에 넣고 출력해보시오.

    char[] alphabets = new char[26];
    char ch = 'A';

    for (int i=0; i<alphabets.length; i++) {
      alphabets[i] = ch++;
    }

    for (int i=0; i<alphabets.length;i++) {
      System.out.println(alphabets[i] + "," + (int)alphabets[i]);
    }

  }

}
