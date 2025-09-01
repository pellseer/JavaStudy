package practice.quiz1;

public class StudentTest {

  public static void main(String[] args) {

    Student studentLee = new Student(1001, "Lee");
    Student studentKim = new Student(1002, "Kim");
    Student studentCho = new Student(1003, "Cho");

    for (int i = 0; i<2; i++) {
      studentLee.addBookList("태백산맥" + (i+1), "조정래");
    }

    for (int i = 0; i<3; i++) {
      studentKim.addBookList("토지" + (i+1), "박경리");
    }

    for (int i = 0; i<6; i++) {
      studentCho.addBookList("해리포터" + (i+1), "조앤 롤링");
    }

    studentLee.showStudentBookList();
    studentKim.showStudentBookList();
    studentCho.showStudentBookList();

  }

}
