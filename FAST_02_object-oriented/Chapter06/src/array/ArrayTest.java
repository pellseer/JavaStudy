package array;

public class ArrayTest {

  public static void main(String[] args) {

    // int[] arr = new int[] {1,2,3}; // 선언과 동시에 초기화 시에는 new 키워드 생략가능
    int[] arr = new int[10];
    int tatal = 0;

    for (int i=0, num=1; i<arr.length; i++, num++) {
      arr[i] = num;
    }

    for (int i=0; i<arr.length; i++) {
      tatal += arr[i];
    }

    System.out.println(tatal);

    double[] dArr = new double[5];
    int count = 0; // 유효한 값의 범위를 위해서 선언

    dArr[0] = 1.1; count++;
    dArr[1] = 2.1; count++;
    dArr[2] = 3.1; count++;

    double mtotal = 1;
    for (int i=0; i<count; i++){
      mtotal *= dArr[i];
    }

    System.out.println(mtotal);

  }

}
