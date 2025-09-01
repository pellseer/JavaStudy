package variable;

public class DoubleTest2 {
  public static void main(String[] args) {

    double dNum = 1;

    for( int i=0; i<10000; i++) { // 부동 소수점 방식 오류에 대한 예제
      dNum = dNum + 0.1;
    }

    System.out.println(dNum);

  }
}
