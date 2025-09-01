package stream.inputstream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest2 {

  public static void main(String[] args) {

    System.out.println("입력 후 끝이라고 쓰세요 : ");

    try {
      int i;
      // 한글을 사용하려면 보조스트림을 이용해야 한다.
      InputStreamReader isr = new InputStreamReader(System.in);

      while ( (i = isr.read()) != '끝') {
        System.out.print((char)i);
      }
    } catch (IOException e) {
      System.out.println(e);
    }

  }

}
