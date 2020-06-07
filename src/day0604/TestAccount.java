package day0604;

public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000, 0.45);
        account.withdraw(30000);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("余额："+account.getBalance()+"，月利率"+account.getAnnualInterestRate());

        CheckAccount checkAccount = new CheckAccount(1122, 20000, 0.45, 5000);
        checkAccount.withdraw(5000);
        checkAccount.withdraw(18000);
        checkAccount.withdraw(3000);

    }
}
