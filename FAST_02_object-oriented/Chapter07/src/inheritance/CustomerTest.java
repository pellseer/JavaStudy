package inheritance;

public class CustomerTest {

  public static void main(String[] args) {

    Customer customerLee = new Customer(10010, "이순신");
//    customerLee.setCustomerName("이순신");
//    customerLee.setCustomerID(10010);
    customerLee.bonusPoint = 1000;
    System.out.println(customerLee.showCustomerInfo());

    VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
//    customerKim.setCustomerName("김유신");
//    customerKim.setCustomerID(10020);
    customerKim.bonusPoint = 10000;
    System.out.println(customerKim.showCustomerInfo());

    customerLee = customerKim; // 업캐스팅, 묵시적 형변환, 하위 클래스 타입은 상위 클래스로 자동 형변환

  }

}
