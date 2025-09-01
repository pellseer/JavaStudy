package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args) {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("a.html");
        } catch (FileNotFoundException e){
            System.out.println(e);
        } finally {
            try {
                fis.close();
                System.out.println("finally");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("end");
    }
}
