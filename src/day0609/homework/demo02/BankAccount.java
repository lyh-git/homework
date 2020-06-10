package day0609.homework.demo02;

public class BankAccount {
    public static void main(String[] args) {
        System.out.println(new BankAccount("123"));
        System.out.println(new BankAccount("1234"));
        System.out.println(new BankAccount("1235"));
    }

    private static Integer total = 10001;
    private Integer account;
    private static Double interestRate = 0.04;
    private String password;
    private Double balance;
    private static Double minBalance = 100.0;

    public BankAccount(String password) {
        this.password = password;
        total++;
        account = total;
        balance = 100000.0;

    }

    public Integer getAccount() {
        return account;
    }

    public void setAccount(Integer account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "acc='" + account + '\'' +
                "password='" + password + '\'' +
                ", balance=" + balance + '\'' +
                ", minBalance=" + minBalance + '\'' +
                ", interestRate=" + interestRate +
                '}';
    }
}
