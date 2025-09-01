package hiding;

import hiding.MyDate;

public class MyDateTest {
    public static void main(String[] args){

        MyDate date = new MyDate();

        date.setDay(100);
        date.setMonth(77);
        date.setYear(2025);

        date.showDate();
    }
}
