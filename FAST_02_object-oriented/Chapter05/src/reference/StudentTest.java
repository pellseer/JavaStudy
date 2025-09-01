package reference;

public class StudentTest {

  public static void main(String[] args) {

    Student studentJang = new Student(100,"Jang");
    studentJang.setKoreaSubject("국어", 100);
    studentJang.setMathSubject("수학", 95);

    Student studentKim = new Student(101, "Kim");
    studentKim.setKoreaSubject("국어", 80);
    studentKim.setMathSubject("수학", 99);

    studentJang.showStudentScore();
    studentKim.showStudentScore();

  }

}
