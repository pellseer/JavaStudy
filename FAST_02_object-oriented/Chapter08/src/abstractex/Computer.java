package abstractex;

public abstract class Computer {

  public abstract void display(); // 메소드의 구현부가 없이 선언부만 있는게 추상 메소드
  public abstract void typing(); // 구현부는 하위클래스(자식클래스)에서 구현

  public void turnOn() {
    System.out.println("전원을 켭니다.");
  }

  public void turnOff() {
    System.out.println("전원을 끕니다.");
  }

}
