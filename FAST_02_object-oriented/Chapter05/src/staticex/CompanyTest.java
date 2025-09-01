package staticex;

import java.util.Calendar;

public class CompanyTest {

  public static void main(String[] args) {

    Company company1 = Company.getInstance();
    Company company2 = Company.getInstance();

    System.out.println(company1); // company1, company2가 같은 주소값을 가지고 있음을 알 수 있다.
    System.out.println(company2);

    Calendar calendar = Calendar.getInstance();

  }

}
