package day0606.dome04;

public class OldPhone extends Phone {
    @Override
    public void call() {
        System.out.println("旧手机打电话");
    }

    @Override
    public void sendMessage() {
        System.out.println("旧手机发短信");
    }
}
