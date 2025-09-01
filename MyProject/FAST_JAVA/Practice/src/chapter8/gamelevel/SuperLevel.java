package chapter8.gamelevel;

public class SuperLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("엄청 빨리 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("아주 높이 점프 합니다.");
    }

    @Override
    public void turn() {
        System.out.println("돌기 합니다.");

    }

    @Override
    public void showLevelMessage() {
        System.out.println("***************** 고급자 레벨읿니다. *****************");
    }
}
