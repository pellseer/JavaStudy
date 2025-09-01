package variable;

public class ImplicitConversion {
  public static void main(String[] args) {

    byte bNum = 10;
    int iNum = bNum; // 묵시적 형변환

    System.out.println(bNum);
    System.out.println(iNum);

    int iNum2 = 20;
    float fNum = iNum2;

    System.out.println(fNum);

    double dNum;
    dNum = fNum + iNum; // iNum이 float 형으로 바뀌고 계산한 뒤에 double로 형변환

    System.out.println(dNum);



  }
}
