package polymorphism;

import java.util.ArrayList;

public class CustomerTest {

  public static void main(String[] args) {

    Customer customerLee = new Customer(10010, "Lee");
    Customer customerKim = new GoldCustomer(10020, "Kim");
    Customer customerJang = new VIPCustomer(10030, "Jang");

    ArrayList<Customer> customerList = new ArrayList<Customer>();

    customerList.add(customerLee);
    customerList.add(customerKim);
    customerList.add(customerJang);

    for (Customer customer : customerList) {
      System.out.println(customer.calcPrice(10000));
      System.out.println(customer.showCustomerInfo());
    }

  }

}
