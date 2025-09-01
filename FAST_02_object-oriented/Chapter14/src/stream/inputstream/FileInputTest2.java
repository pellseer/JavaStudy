package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputTest2 {

  public static void main(String[] args) {

    try(FileInputStream fis = new FileInputStream("input.txt")) {

      int i;
      while ( (i = fis.read()) != -1) {
        System.out.print((char) i);
      }
      System.out.println();

    } catch (IOException e) {
      System.out.println(e);
    }

    System.out.println("end");
  }

}
