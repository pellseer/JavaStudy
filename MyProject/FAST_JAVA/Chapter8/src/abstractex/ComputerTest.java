package abstractex;

public class ComputerTest {
    public static void main(String[] args){
        Computer computer = new DestTop();
        computer.display();
        computer.turnOff();

        Computer myNote = new MyNoteBook();
    }
}
