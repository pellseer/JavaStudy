package practice.quiz4;

public class Person {

  String name;
  int money;

  public Person(String name, int money) {
    this.name = name;
    this.money = money;
  }

  public void showMoneyInfo() {
    System.out.println(name + "님의 현재 남은 금액은 " + money + "원 입니다.");
  }

  public void buyStarCoffee(StarCoffee starCoffee, int money) {
    this.money -= money;
    System.out.println(starCoffee.buyCoffee(money));
  }

  public void buyBeanCoffee(BeanCoffee beanCoffee, int money) {
    this.money -= money;
    System.out.println(beanCoffee.buyCoffee(money));
  }

}
