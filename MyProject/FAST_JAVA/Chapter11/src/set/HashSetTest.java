package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
    public static void main(String[] args){

        HashSet<String> set = new HashSet<String>();
        set.add("이");
        set.add("김");
        set.add("강");
        set.add("이");

        System.out.println(set);

        Iterator<String> ir = set.iterator();
        while (ir.hasNext()){
            String str = ir.next();
            System.out.println(str);

        }


//        ArrayList<String> set2 = new ArrayList<String>();
//        set2.add("이");
//        set2.add("김");
//        set2.add("강");
//        set2.add("이");
//
//        System.out.println(set2);
    }
}
