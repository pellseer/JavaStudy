package template;

public abstract class Car {

  public abstract void drive();
  public abstract void stop();

  public void startCar() {
    System.out.println("시동을 켭니다.");
  }

  public void turnOff(){
    System.out.println("시동을 끕니다.");
  }

  public void washCar() {} // 구현에 확장을 할 수 있는 메소드

  final public void run(){ // 템플릿 메소드 패턴, 이 순서대로 메소드를 실행해야 하므로 final 키워드로 재정의 할 수 없도록 만든다.
    startCar();
    drive();
    stop();
    turnOff();
    washCar();
  }

}
