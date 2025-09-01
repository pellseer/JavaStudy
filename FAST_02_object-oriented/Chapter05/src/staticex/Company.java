package staticex;

public class Company {
  // Singleton Pattern 예제

  private static Company instance = new Company(); // 내부에서 인스턴스를 생성

  private Company() { // 생성자를 private 접근제한자로 정해두면 외부에서 인스턴스 생성 불가

  }

  public static Company getInstance() { // static 메소드여야 외부에서 인스턴스 반환하여 사용

    if (instance == null){
      instance = new Company();
    }

    return instance;

  }

}
