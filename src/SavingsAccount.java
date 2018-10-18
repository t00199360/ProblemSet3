import javax.swing.*;

public class SavingsAccount extends BankAccount
{

    private double balance;

    //accessor methods


    @Override
    public int getAccNum()
    {
        return super.getAccNum();
    }

    @Override
    public String getName()
    {
        return super.getName();
    }

    public double getBalance()
    {
        return balance;
    }

    //mutator methods


    @Override
    public void setAccNum(int accNum)
    {
        super.setAccNum(accNum);
    }

    @Override
    public void setName(String name)
    {
        super.setName(name);
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    //no argument constructor

    public SavingsAccount()
    {
      this.balance=0.00;
      this.accNum=0;
      this.name="unknown";
    }

    //3 argument constructor
    public SavingsAccount(int accNum, double balance, String name)
    {
        setName(name);
        setAccNum(accNum);
        setBalance(balance);
    }

    @Override
    public String toString() {
        return "Name:" + name + "\nAccount Number:" + accNum + "\nBalance:" + balance;
    }
    public String toString2() {
        return "Name:" + name + "\nAccount Number:" + accNum + "\nBalance:" + balance;
    }

    private void askTrans() {
        withdraw(0);
        lodge(0);
    }

    @Override
    public void calcTax(double a) {

    }

    @Override
    public void lodge(double a) {
        balance=a+balance;
    }

    @Override
    public void withdraw(double a) {
        balance=balance-a;
    }
}
