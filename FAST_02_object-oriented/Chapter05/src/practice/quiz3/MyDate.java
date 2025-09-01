package practice.quiz3;

public class MyDate {

  private int day;
  private int month;
  private int year;

  boolean isValid;

  public int getDay() {
    return day;
  }

  public int getMonth() {
    return month;
  }

  public int getYear() {
    return year;
  }

  public void setDay(int day) {
    this.day = day;
  }

  public void setMonth(int month) {
    this.month = month;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public MyDate(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public String isValid() {

    String result;

    switch (month) {
      case 1: case 3: case 5: case 7: case 8: case 10: case 12:
        isValid = day <= 31 && day >= 1;
        break;
      case 2:
        isValid = day <= 28 && day >= 1;
        break;
      case 4: case 6: case 9: case 11:
        isValid = day <= 30 && day >= 1;
        break;
      default:
        System.out.println("월은 1월부터 12월까지만 존재합니다.");
    }

    if (isValid) {
      result = "유효한 날짜입니다.";
    } else {
      result = "유효하지 않은 날짜입니다.";
    }

    return result;

  }

}
