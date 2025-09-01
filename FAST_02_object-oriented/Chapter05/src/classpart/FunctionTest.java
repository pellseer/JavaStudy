package classpart;

public class FunctionTest {

  public static int addNum(int num1, int num2) {

    int result;
    result = num1 + num2;

    return result;
  }

  public static int subNum(int num1, int num2) {

    int result;
    result = num1 - num2;

    return result;
  }

  public static int mulNum(int num1, int num2) {

    int result;
    result = num1 * num2;

    return result;
  }

  public static int divNum(int num1, int num2) {

    int result;
    result = num1 / num2;

    return result;
  }

  public static void sayHello(String greeting) {
    System.out.println(greeting);
  }

  public static int calcSum() {
    int sum = 0;
    int i;

    for (i = 0; i <= 100; i++) {
      sum += i;
    }

    return sum;
  }

  public static void main(String[] args) {

    int n1 = 40;
    int n2 = 20;

    int addResult = addNum(n1, n2);
    int subResult = subNum(n1, n2);
    int mulResult = mulNum(n1, n2);
    int divResult = divNum(n1, n2);

    sayHello("안녕하세요.");
    int num = calcSum();

    System.out.println(addResult);
    System.out.println(subResult);
    System.out.println(mulResult);
    System.out.println(divResult);
    System.out.println(num);

  }

}
