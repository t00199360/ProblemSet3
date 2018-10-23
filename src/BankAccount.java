public abstract class BankAccount implements Transactable, Taxable
{
    protected String name;
    protected int accNum;

    //accessor methods

    public int getAccNum()
    {
        return accNum;
    }

    public String getName()
    {
        return name;
    }

    //mutator methods


    public void setAccNum(int accNum)
    {
        this.accNum = accNum;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    //no argument constructor

    public BankAccount()
    {
        this.accNum=0;
        this.name="unknown";
    }

    //2 argument constructor

   /* public BankAccount(int accNum,String name)
    {
        this.accNum=accNum;
        this.name=name;
    }*/


    public abstract double calcTax ();

    public abstract void lodge(double a);

    public abstract void withdraw(double a);



}
