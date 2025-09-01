package innerclass;

class OutClass {

  private int num = 10;
  private static int sNum = 20;
  private InnerClass innerClass;

  public OutClass() {
    innerClass = new InnerClass();
  }

  // Instance Inner Class
  class InnerClass {
    int iNum = 100;
//    static int sInNum = 200; // InnerClass 에서는 static 사용 불가. static class로 만들면 가능

    void inTest() {
      System.out.println(num);
      System.out.println(sNum);
    }
  }

  public void usingInner() {
    innerClass.inTest();
  }

  // static Inner Class
  static class StaticInnerClass {
    int inNum = 100;
    static int sInNum = 200;

    void inTest() {
      System.out.println(inNum);
      System.out.println(sInNum);
      System.out.println(sNum);
//      System.out.println(num); // static이 아닌 변수는 사용 불가
    }

    static void sTest() {
//      System.out.println(inNum); // static이 아닌 일반 변수이므로 사용 불가
      System.out.println(sInNum);
      System.out.println(sNum);
    }
  }

}

public class InnerTest {

  public static void main(String[] args) {

    OutClass outClass = new OutClass();
    outClass.usingInner();

    OutClass.InnerClass myInnerClass = outClass.new InnerClass(); // 많이 사용하지 않는 문법
    myInnerClass.inTest();

    System.out.println();

    OutClass.StaticInnerClass staticInnerClass = new OutClass.StaticInnerClass();
    staticInnerClass.inTest();

    OutClass.StaticInnerClass.sTest();

  }

}
