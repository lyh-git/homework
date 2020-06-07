package day0604;

public class Account {
    private int id;
    protected double balance;
    private double annualInterestRate;

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public void withdraw (double amount){
        if (getBalance()>amount) {
            setBalance(getBalance()-amount);
            System.out.println("取款："+amount+",余额："+getBalance());
        }else {
            System.out.println("余额不足！您的余额为"+getBalance());
//            System.out.println(getBalance());
        }
    }
    public void deposit (double amount){
        setBalance(amount+getBalance());
        System.out.println("存款："+amount+",余额："+getBalance());
    }
}
