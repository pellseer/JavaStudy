package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

  public static void main(String[] args) {

    List<String> stringList = new ArrayList<String>();
    stringList.add("Tomas");
    stringList.add("Edward");
    stringList.add("Jack");

    Stream<String> stream = stringList.stream();
    stream.forEach(s -> System.out.print(s + " "));
    System.out.println();

    // sorted 사용하려면 Comparable 구현을 해야한다. String은 이미 구현되어 있음
    stringList.stream().sorted().forEach(s -> System.out.print(s + " "));
    System.out.println();

    stringList.stream().map(s -> s.length()).forEach(n -> System.out.println(n));

  }

}
