package steam.inputsteam;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest {
    public static void main(String[] args){
        System.out.println("입력:");

        try {
            int i;
            InputStreamReader isr = new InputStreamReader(System.in);
            while((i = isr.read()) != '끝'){
                System.out.println(i);
                System.out.println((char)i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
