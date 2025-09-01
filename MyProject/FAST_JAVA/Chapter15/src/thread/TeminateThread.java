package thread;

import java.io.IOException;

import static java.lang.Thread.sleep;

public class TeminateThread extends Thread{

    private boolean flag = false;
    int i;

    public TeminateThread(String name){
        super(name);
    }

    public void run(){
        while (!flag){
            try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(getId() + " end");
    }

    public void setFlag(boolean flag){
        this.flag = flag;
    }

    public static void main(String[] args) throws IOException {
        TeminateThread threadA = new TeminateThread("A");
        TeminateThread threadB = new TeminateThread("B");

        threadA.start();
        threadB.start();

        int in;
        while (true){
            in = System.in.read();
            if(in =='A'){
                threadA.setFlag(true);
            }
            else if(in =='B'){
                threadB.setFlag(true);
            }
            else if(in =='M'){
                threadA.setFlag(true);
                threadB.setFlag(true);
                break;
            }
            else{
                System.out.println("try again");
            }
        }
        System.out.println("main end");

    }
}
