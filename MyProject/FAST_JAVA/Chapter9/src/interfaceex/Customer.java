package interfaceex;

public class Customer implements Buy, Sell{
    @Override
    public void buy() {
        System.out.println("Customer buy");
    }

    @Override
    public void sell() {
        System.out.println("Customer sell");
    }

    @Override
    public void order() {
        System.out.println("Customer order");
//        Buy.super.order();
    }

    public void sayHello(){
        System.out.println("hello");
    }
}
