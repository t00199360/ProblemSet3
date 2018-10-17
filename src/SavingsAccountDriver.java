import javax.swing.*;
import java.util.Arrays;

public class SavingsAccountDriver
{
    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(null, "Bank Savings Accounts");


        SavingsAccount savings = new SavingsAccount();

        //no argument constructor print out
        JOptionPane.showMessageDialog(null, savings.toString());

        //creating the array for the objects
        int numAccounts=Integer.parseInt(JOptionPane.showInputDialog(null, "How many accounts would you like to enter into the system?"));
        SavingsAccount []accountArray = new SavingsAccount[numAccounts];


        for(int i=0;i<numAccounts;i++)
        {
            //3 argument constructor print out
            String nameAsString = JOptionPane.showInputDialog(null, "What is your name:   ");
            int accNum = Integer.parseInt(JOptionPane.showInputDialog(null, "What is your account number:   "));
            double balAsDouble = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter your balance:   "));

            SavingsAccount hellaBread = new SavingsAccount(accNum, balAsDouble, nameAsString);
            accountArray[i]= hellaBread;
        }

        //use .replace to get rid of the square brackets and commas in the printout
        JOptionPane.showMessageDialog(null, Arrays.toString(accountArray).replace("[","").replace("]","").replace(",","\n"));
        System.exit(0);
    }
}
