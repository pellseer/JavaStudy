package practice.quiz1;

import java.util.ArrayList;

public class Student {

  private int studentID;
  private String name;
  ArrayList<Book> bookArrayList = new ArrayList<Book>();

  public Student(int studentID, String name) {
    this.studentID = studentID;
    this.name = name;
  }

  public void addBookList(String bookName, String author) {
    Book book = new Book(bookName, author);
    bookArrayList.add(book);
  }

  public void showStudentBookList() {
    System.out.print(name + " 학생이 읽은 책은 : ");
    for (Book book : bookArrayList) {
      System.out.print(book.getBookName() + " ");
    }
    System.out.println("입니다.");
  }

}
