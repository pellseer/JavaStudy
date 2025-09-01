package cooperation;

public class TakeTransTest {

  public static void main(String[] args) {
    Student studentJang = new Student("Jang", 5000);
    Student studentT = new Student("Tomas", 10000);
    Student studentE = new Student("Edward", 20000);

    Bus bus100 = new Bus(100);
    Bus bus500 = new Bus(500);

    Subway subwayGreen = new Subway(2);
    Subway subwayBlue = new Subway(4);

    Taxi taxiBoeun = new Taxi("Boeun");
    Taxi taxiCheongju = new Taxi("Cheongju");

    studentJang.takeBus(bus100);
    studentT.takeSubway(subwayGreen);
    studentE.takeTaxi(taxiBoeun, 10000);

    studentJang.showInfo();
    studentT.showInfo();
    studentE.showInfo();

    System.out.println();

    bus100.showBusInfo();
    bus500.showBusInfo();

    System.out.println();

    subwayGreen.showSubwayInfo();
    subwayBlue.showSubwayInfo();

    System.out.println();

    taxiBoeun.showTaxiInfo();
    taxiCheongju.showTaxiInfo();

  }

}
