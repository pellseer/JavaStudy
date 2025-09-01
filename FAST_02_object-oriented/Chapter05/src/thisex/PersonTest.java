package thisex;

public class PersonTest {

  public static void main(String[] args) {
    Person personNoname = new Person();
    personNoname.showInfo();

    Person personJang = new Person("Jang", 28);
    personJang.showInfo();
    System.out.println(personJang);

    Person p = personJang.getSelf(); // this로 반환된 인스턴스의 주소값
    System.out.println(p);

  }

}
