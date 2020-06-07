package day0604;

public class CheckAccount extends Account {
    private double overdraft;

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    public CheckAccount(int id, double balance, double annualInterestRate) {
        super(id, balance, annualInterestRate);
    }

    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
        this(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("余额" + getBalance() + ",可透支额度" + getOverdraft());
        if (getBalance() > amount) {
            setBalance(getBalance() - amount);
            System.out.println("取款：" + amount + ",余额：" + getBalance());
        } else if (amount > getBalance()) {
            if (amount - getBalance() < getOverdraft()) {
                setOverdraft(getOverdraft() - (amount - getBalance()));
                setBalance(0);
                System.out.println("透支额度为：" + getOverdraft());
            } else {
                System.out.println("余额不足！您的余额为" + getBalance());
            }
//            System.out.println(getBalance());
        }
    }
}
