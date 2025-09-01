package hiding;

public class MyDate {

  private int day; // public 접근제한자를 명시하면 다른 패키지의 클래스에서도 접근가능
  // default 접근제한자는 같은 패키지 내에서만 접근가능
  private int month;
  private int year;

  private boolean isValid; // boolean은 초기값 false.

  public void setDay(int day) { // this는 클래스가 가진 필드를 가르킨다.
    this.day = day;
  }

  public int getDay() {
    return day;
  }

  public void setMonth(int month) {
    if (month < 1 || month > 12)
      isValid = false;

    this.month = month;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public void showDate() {
    if (isValid) {
      System.out.println(year + "년 " + month + "월 " + day + "일");
    } else {
      System.out.println("윺효하지 않은 날짜 입니다.");
    }

  }

}
