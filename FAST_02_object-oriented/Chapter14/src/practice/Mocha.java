package practice;

public class Mocha extends Decorator{

  public Mocha(Coffee coffee) {
    super(coffee);
  }

  @Override
  public void brewing() {
    coffee.brewing();
    System.out.print("+ Adding Mocha Syrup ");
  }

}
