package classpart;

public class StudentTest {

  public static void main(String[] args) {

    Student studentJang = new Student("장봉"); // name을 생성자 매개변수로 전달
//    studentJang.studentName = "장봉";
    studentJang.address = "서울";

    studentJang.showStudentInfo();

    Student studentKim = new Student(100, "김유신"); // id와 name을 생성자 매개변수로 전달
//    studentKim.studentName = "김유신";
//    studentKim.address = "경주";

    studentKim.showStudentInfo();

  }

}
