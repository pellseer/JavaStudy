package array;

public class ObjectCopy2 {

  public static void main(String[] args) {

    Book[] library = new Book[5];
    Book[] copyLibrary = new Book[5];

    library[0] = new Book("태백산맥1", "조정래");
    library[1] = new Book("태백산맥2", "조정래");
    library[2] = new Book("태백산맥3", "조정래");
    library[3] = new Book("태백산맥4", "조정래");
    library[4] = new Book("태백산맥5", "조정래");

    copyLibrary[0] = new Book();
    copyLibrary[1] = new Book();
    copyLibrary[2] = new Book();
    copyLibrary[3] = new Book();
    copyLibrary[4] = new Book();

    for (int i=0; i<library.length; i++) { // 깊은 복사를 위해서 각각 다른 인스턴스에 값만 복사해주면 나중에 기존 객체 배열을 변경해도 복사된 객체엔 지장이 없다.
      copyLibrary[i].setAuthor(library[i].getAuthor());
      copyLibrary[i].setTitle(library[i].getTitle());
    }

    library[0].setTitle("나목");
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
