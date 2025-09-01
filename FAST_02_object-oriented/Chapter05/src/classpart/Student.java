package classpart;

public class Student {

  private int studentID;
  public String studentName; // String은 문자열을 사용하기 위한 자바에서 제공하는 클래스
  public String address;

  public Student() {} // default 생성자

  public Student(String name) {
    studentName = name;
  }

  public Student(int id, String name) {
    studentID = id;
    studentName = name;
    address = "주소 없음";
  }

  public void showStudentInfo() {
    System.out.println(studentName + ", " + address);
  }

  public String getStudentName() {
    return studentName;
  }

/*
  public static void main(String[] args) { // Test 클래스를 따로 만들지 않고 클래스 내부에서 실행하는 경우도 있는데, main은 Student의 메소드가 아니다.

    Student studentPark = new Student();
    studentPark.studentName = "박은총";
    studentPark.showStudentInfo();

  }
*/

}
