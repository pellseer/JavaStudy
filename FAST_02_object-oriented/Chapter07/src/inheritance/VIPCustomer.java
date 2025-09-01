package inheritance;

public class VIPCustomer extends Customer{

  double salesRatio;
  private int agentID;

  public VIPCustomer(int customerID, String customerName) {
    super(customerID, customerName);

    customerGrade = "VIP";
    bonusRatio = 0.05;
    salesRatio = 0.01;

//    System.out.println("VIPCustomer(int, String) 생성자 호출");
  }

//  public VIPCustomer() {
//    customerGrade = "VIP";
//    bonusRatio = 0.05;
//    salesRatio = 0.01;
//
//    System.out.println("VIPCustomer() 생성자 호출");
//  }

  @Override
  public int calcPrice(int price) {
    bonusPoint += price * bonusRatio;
    return price - (int)(price * salesRatio);
  }

  public int getAgentID() {
    return agentID;
  }

  public void setAgentID(int agentID) {
    this.agentID = agentID;
  }
}
