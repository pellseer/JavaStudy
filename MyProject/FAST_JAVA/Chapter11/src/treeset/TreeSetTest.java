package treeset;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args){
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("홍");
        treeSet.add("강");
        treeSet.add("이");

        for(String str : treeSet){
            System.out.println(str);
        }
        
    }
}
