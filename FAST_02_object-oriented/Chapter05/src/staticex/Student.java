package staticex;

public class Student {

  private static int serialNum = 1000; // static 변수는 데이터영역에 생성된다.
  private int studentID;
  public String studentName; // String은 문자열을 사용하기 위한 자바에서 제공하는 클래스
  public String address;

  public Student() {} // default 생성자

  public Student(String name) {
    studentName = name;
    serialNum++;
    studentID = serialNum;
  }

  public Student(int id, String name) {
    studentID = id;
    studentName = name;
    address = "주소 없음";
    serialNum++;
    studentID = serialNum;
  }

  public void showStudentInfo() {
    System.out.println(studentName + ", " + address);
  }

  public String getStudentName() {
    return studentName;
  }

  public int getStudentID() {
    return studentID;
  }

  public static int getSerialNum() {
    return serialNum;
  }

  public static void setSerialNum(int serialNum) {
    Student.serialNum = serialNum;
  }

}
