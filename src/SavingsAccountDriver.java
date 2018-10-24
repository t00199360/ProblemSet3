import javax.swing.*;
import java.util.Arrays;

public class SavingsAccountDriver
{
    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(null, "Bank Savings Accounts");


       // SavingsAccount savings = new SavingsAccount();

        /*//no argument constructor print out
        JOptionPane.showMessageDialog(null, savings.toString());*/

        //creating the array for the objects
        int numAccounts=Integer.parseInt(JOptionPane.showInputDialog(null, "How many accounts would you like to enter into the system?"));
        SavingsAccount []accountArray = new SavingsAccount[numAccounts];


        for(int i=0;i<numAccounts;i++)
        {
            double newBal;

            //3 argument constructor print out
            String nameAsString = JOptionPane.showInputDialog(null, "What is your name:   ");
            int accNum = Integer.parseInt(JOptionPane.showInputDialog(null, "What is your account number:   "));
            double balAsDouble = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter your balance:   "));

            SavingsAccount SAObject = new SavingsAccount(accNum, balAsDouble, nameAsString);
            SavingsAccount s1 = new SavingsAccount();

            JOptionPane.showMessageDialog(null,"" + SAObject.toString());

            s1.lodge(newBal=Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the amount you wish to lodge to your account")));
            System.out.print(SAObject.getBalance());
            SAObject.lodge(newBal);

            s1.withdraw(newBal=Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the amount you wish to withdraw from your account")));
            System.out.print(SAObject.getBalance());
            SAObject.withdraw(newBal);

            s1.calcTax();
            SAObject.calcTax();
            JOptionPane.showMessageDialog(null,"This is your balance after tax: " /*+ s1.getBalance() + " "*/ + SAObject.getBalance());

            accountArray[i]= SAObject;
        }

        //use .replace to get rid of the square brackets and commas in the printout
        JOptionPane.showMessageDialog(null, Arrays.toString(accountArray).replace("[","").replace("]","").replace(",","\n"));
        System.exit(0);
    }

}
