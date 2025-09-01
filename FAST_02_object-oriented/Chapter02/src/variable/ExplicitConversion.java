package variable;

public class ExplicitConversion {
  public static void main(String[] args) {

    int i = 1000;
    byte bNum = (byte) i; // 명시적 형변환
    System.out.println(bNum); // 데이터 유실 발생 가능

    double dNum = 1.2;
    float fNum = 0.9F;

    int iNum1 = (int) (dNum + fNum);
    int iNum2 = (int)dNum + (int)fNum;

    System.out.println(iNum1);
    System.out.println(iNum2);

  }
}
