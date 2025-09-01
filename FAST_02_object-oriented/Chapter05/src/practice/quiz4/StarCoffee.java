package practice.quiz4;

public class StarCoffee {

  int money;

  public String buyCoffee(int money) {
    this.money += money;

    if (money == Menu.STAR_AMERICANO) {
      return "별 다방 아메리카노를 구입했습니다.";
    } else if (money == Menu.STAR_LATTE) {
      return "별 다방 라떼를 구입했습니다.";
    } else {
      return null;
    }

  }

}
