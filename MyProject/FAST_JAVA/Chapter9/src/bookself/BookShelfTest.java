package bookself;

public class BookShelfTest {
    public static void main(String[] args){

        Queue bookQueue = new BookShelf();
        bookQueue.enQueue("태1");
        bookQueue.enQueue("태2");
        bookQueue.enQueue("태3");

        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
    }
}
