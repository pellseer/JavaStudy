package stream.reader;

import java.io.*;

public class FileReaderTest {

  public static void main(String[] args) throws IOException {

    InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"));
    FileReader fr = new FileReader("reader.txt");

    int i;
    while ((i = isr.read()) != -1) {
      System.out.print((char) i);
    }

    System.out.println();

    while ((i = fr.read()) != -1) {
      System.out.print((char) i);
    }

    isr.close();

  }

}
