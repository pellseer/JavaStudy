package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
    public static void main(String[] args){
        List<String> sList = new ArrayList<String>();
        sList.add("T");
        sList.add("E");
        sList.add("J");

        Stream<String> stream = sList.stream();
        stream.forEach(s->System.out.println(s+ " "));
        System.out.println();

        sList.stream().sorted().forEach(s->System.out.println(s+ " "));
        System.out.println();

        sList.stream().map(s->s.length()).forEach(n->System.out.println(n));
    }
}
