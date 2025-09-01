package inheritance;

public class OverridingTest {

  public static void main(String[] args) {

    Customer customerLee = new Customer(10010, "이순신");
    customerLee.bonusPoint = 1000;

    VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
    customerKim.bonusPoint = 10000;

    int priceLee = customerLee.calcPrice(10000);
    int priceKim = customerKim.calcPrice(10000);

    System.out.println(customerLee.showCustomerInfo() + "지불금액은 " + priceLee + "원 입니다.");

    System.out.println(customerKim.showCustomerInfo() + "지불금액은 " + priceKim + "원 입니다.");

    Customer customerNo = new VIPCustomer(10030, "나몰라");
    customerNo.bonusPoint = 10000;

    // 상위클래스 형으로 인스턴스를 생성하더라도 오버라이딩한 메서드는 해당 인스턴스의 메서드가 호출된다. 여기서는 VIPCustomer
    System.out.println(customerNo.showCustomerInfo() + "지불금액은 " + customerNo.calcPrice(10000) + "원 입니다.");

  }

}
