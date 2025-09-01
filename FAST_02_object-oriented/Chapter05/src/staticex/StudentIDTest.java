package staticex;

public class StudentIDTest {

  public static void main(String[] args) {

    Student studentJang = new Student("Jang");
    System.out.println(Student.getSerialNum()); // 인스턴스의 생성과는 상관없이 사용 가능.

    Student studentKim = new Student("Kim");
    System.out.println(Student.getSerialNum()); // static 변수는 모든 인스턴스가 공유하기 때문에 같은 값이 나온다.
    System.out.println(Student.getSerialNum());

    System.out.println(studentJang.getStudentID());
    System.out.println(studentKim.getStudentID());

  }

}
