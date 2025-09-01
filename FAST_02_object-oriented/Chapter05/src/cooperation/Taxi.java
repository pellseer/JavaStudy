package cooperation;

public class Taxi {

  String companyName;
  int money;
  int passengerCount;

  public Taxi(String companyName) {
    this.companyName = companyName;
  }

  public void take(int money) {
    this.money += money;
    passengerCount++;
  }

  public void showTaxiInfo() {
    System.out.println(companyName + " 택시가 태운 승객의 수는 " + passengerCount + "명이고, 수입은 " + money + "원 입니다.");
  }

}
