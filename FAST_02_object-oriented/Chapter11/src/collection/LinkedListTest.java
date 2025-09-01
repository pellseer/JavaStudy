package collection;

import java.util.LinkedList;

public class LinkedListTest {

  public static void main(String[] args) {

    LinkedList<String> myList = new LinkedList<String>();

    myList.add("A");
    myList.add("B");
    myList.add("C");

    System.out.println(myList);

    myList.add(1,"D");
    System.out.println(myList);

    myList.removeLast();
    System.out.println(myList);

    for (int i = 0; i < myList.size(); i++) { // List 인터페이스와 Set 인터페이스의 가장 큰 차이는 순서가 존재하느냐
      String s = myList.get(i);
      System.out.println(s);
    }

  }

}
