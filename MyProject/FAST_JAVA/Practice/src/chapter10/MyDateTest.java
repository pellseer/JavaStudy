package chapter10;

class MyDate {

    int day;
    int month;
    int year;

    public MyDate(final int day, final int month, final int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MyDate) {
            MyDate myDate = (MyDate) obj;
            return this.day == myDate.day && this.month == myDate.month && this.year == myDate.year;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return day;
    }

}

public class MyDateTest {

    public static void main(String[] args) {

        MyDate date1 = new MyDate(24, 2, 2021);
        MyDate date2 = new MyDate(24, 2, 2021);

        System.out.println(date1.equals(date2));

    }

}
