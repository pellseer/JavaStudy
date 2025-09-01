package practice.quiz4;

public class CoffeeTest {

  public static void main(String[] args) {

    Person jang = new Person("jang", 10000);
    Person lee = new Person("lee", 15000);
    StarCoffee starCoffee = new StarCoffee();
    BeanCoffee beanCoffee = new BeanCoffee();

    jang.buyStarCoffee(starCoffee,Menu.STAR_LATTE);
    lee.buyBeanCoffee(beanCoffee,Menu.BEAN_AMERICANO);

    jang.showMoneyInfo();
    lee.showMoneyInfo();

  }

}
