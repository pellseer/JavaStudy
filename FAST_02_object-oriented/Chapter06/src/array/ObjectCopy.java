package array;

public class ObjectCopy {

  public static void main(String[] args) {

    Book[] library = new Book[5];
    Book[] copyLibrary = new Book[5];

    library[0] = new Book("태백산맥1", "조정래");
    library[1] = new Book("태백산맥2", "조정래");
    library[2] = new Book("태백산맥3", "조정래");
    library[3] = new Book("태백산맥4", "조정래");
    library[4] = new Book("태백산맥5", "조정래");

    System.arraycopy(library, 0, copyLibrary, 0, 5); // 얕은 복사로 객체를 생성해서 복사하는 것이 아니라 참조되는 주소값을 복사

    for (Book book : copyLibrary) { // 향상된 for문
      book.showBookInfo();
    }

    library[0].setTitle("나목"); // 여기서 변경하면 copy한 객체 배열에서도 변경됨
    library[0].setAuthor("박완서");

    for (Book book : library) {
      book.showBookInfo();
    }

    System.out.println("------------------------");

    for (Book book : copyLibrary) {
      book.showBookInfo();
    }

  }

}
