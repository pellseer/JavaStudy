package practice.quiz4;

public class BeanCoffee {

  int money;

  public String buyCoffee(int money) {
    this.money += money;

    if (money == Menu.BEAN_AMERICANO) {
      return "콩 다방 아메리카노를 구입했습니다.";
    } else if (money == Menu.BEAN_LATTE) {
      return "콩 다방 라떼를 구입했습니다.";
    } else {
      return null;
    }

  }

}
