package interfaceex;

public class CalcTest {

  public static void main(String[] args) {

    Calculator calc = new CompleteCalc();
    int n1 = 10;
    int n2 = 2;

    System.out.println(calc.add(n1, n2));
    System.out.println(calc.substract(n1, n2));
    System.out.println(calc.times(n1, n2));
    System.out.println(calc.divide(n1, n2));

//    calc.showInfo(); // CompleteCalc 타입에서만 사용가능.

    calc.description(); // default 메서드 사용, 오버라이딩 할수도 있다.

    int[] arr = {1,2,3,4,5};
    int sum = Calc.total(arr); // static으로 선언해놓으면 인스턴스 생성과 상관없이 가져다 쓸 수 있다.
    System.out.println(sum);

  }

}
