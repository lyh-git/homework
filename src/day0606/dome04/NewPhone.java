package day0606.dome04;

public class NewPhone  extends Phone implements IPlay{
    @Override
    public void call() {
        System.out.println("新手机打电话");
    }

    @Override
    public void sendMessage() {
        System.out.println("新手机发短信");
    }

    @Override
    public void playGame() {
        System.out.println("新手机玩游戏");
    }
}
