package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
    public Class LoadCalss(String filename, String className) throws FileNotFoundException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(filename);
        Class c = Class.forName(className);
        return c;
    }

    public static void main(String[] args) {
        ThrowsException test = new ThrowsException();
        try {
            test.LoadCalss("a.txt", "java.lang.String");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
        System.out.println("end");
    }
}
