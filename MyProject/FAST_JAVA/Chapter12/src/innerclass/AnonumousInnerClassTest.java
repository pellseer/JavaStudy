package innerclass;

class AnonumousOuter{
    int outNum = 100;
    static int sNum = 200;
    Runnable getRunnable(int i){
        int num = 100;
        return new Runnable() {

            @Override
            public void run() {

                System.out.println(num);
                System.out.println(i);

                System.out.println(outNum);
                System.out.println(Outer.sNum);
            }
        };
    }

    Runnable runner = new Runnable() {
        @Override
        public void run() {
            System.out.println("test");

        }
    };
}


public class AnonumousInnerClassTest {
    public static void main(String[] args){
        AnonumousOuter outer = new AnonumousOuter();
        Runnable runnable = outer.getRunnable(50);

        runnable.run();

        outer.runner.run();
    }
}
