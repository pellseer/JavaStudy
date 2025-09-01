package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {

  public static void main(String[] args) {

    // Auto Closeable
    try(FileInputStream fis = new FileInputStream("a.txt")) {

    } catch (FileNotFoundException e) {
      System.out.println(e);
    } catch (IOException e) {
      System.out.println(e);
    }

  }

}
