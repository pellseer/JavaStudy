package steam.decorator;

import java.io.*;
import java.net.Socket;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        long miliseconds = 0;

        try(FileInputStream fis = new FileInputStream("file.mp3"); FileOutputStream fos = new FileOutputStream("copy.mp3");
            BufferedInputStream bis = new BufferedInputStream(fis); BufferedOutputStream bos = new BufferedOutputStream(fos)) {
            miliseconds = System.currentTimeMillis();

            int i;
            while ((i = bis.read()) != -1){
                fos.write(i);
            }
            miliseconds = System.currentTimeMillis() - miliseconds;
        } catch (IOException e) {
            System.out.println(e);
        }

        /*Socket socket = new Socket();
        BufferedReader isr = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        isr.readLine();*/

        System.out.println("시간: " + miliseconds);

    }
}
