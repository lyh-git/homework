package day0606.dome04;

public class TestPhone {
    public static void main(String[] args) {
        OldPhone oldPhone = new OldPhone();
        NewPhone newPhone = new NewPhone();
        oldPhone.sendMessage();
        oldPhone.call();
        newPhone.sendMessage();
        newPhone.call();
        newPhone.playGame();


    }
}
