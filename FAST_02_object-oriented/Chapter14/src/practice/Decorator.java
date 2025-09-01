package practice;

public abstract class Decorator extends Coffee{

  Coffee coffee;
  public Decorator(Coffee coffee) {
    this.coffee = coffee;
  }

}
