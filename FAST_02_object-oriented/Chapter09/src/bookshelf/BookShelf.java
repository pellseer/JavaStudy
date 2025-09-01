package bookshelf;

public class BookShelf extends Shelf implements Queue{

  @Override
  public void enQueue(String title) {
    shelf.add(title);
  }

  @Override
  public String deQueue() {
    return shelf.remove(0); // 맨 앞에니깐 0번째를 remove()
  }

  @Override
  public int getSize() {
    return getCount();
  }

}
