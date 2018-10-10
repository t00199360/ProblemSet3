import javax.swing.*;

public class HouseDriver {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Here are the details of the houses you have chosen: ");

        House newHouse = new House();

        //no argument constructor print out
        JOptionPane.showMessageDialog(null, newHouse.toString());

        //4 argument constructor print out
        Person owner = new Person("Liam Dowling", 19, 'M');
        double inputPrice = 0;
        String inputPriceAsString = JOptionPane.showInputDialog("Please enter the price of the house");
        inputPrice = Double.parseDouble(inputPriceAsString);

        if (inputPrice < 0)
        {
            JOptionPane.showMessageDialog(null, "You entered an invalid price. The price must be a positive value, please re-enter the price of the house");
            inputPriceAsString = JOptionPane.showInputDialog("Please enter the price of the house");
            inputPrice = Double.parseDouble(inputPriceAsString);
            House newHouse2 = new House("Liam's House(address)", "2 story house(type)", inputPrice, owner);

            JOptionPane.showMessageDialog(null, newHouse2.toString());
        }
        else
            {
            House newHouse2 = new House("Liam's House(address)", "2 story house(type)", inputPrice, owner);

            JOptionPane.showMessageDialog(null, newHouse2.toString());
            }

            //6 argument constructor print out
            inputPriceAsString = JOptionPane.showInputDialog("Please enter the price of the house");
            inputPrice = Double.parseDouble(inputPriceAsString);

            if (inputPrice<0)
            {
                JOptionPane.showMessageDialog(null, "You entered an invalid price. The price must be a positive value, please re-enter the price of the house");
                inputPriceAsString = JOptionPane.showInputDialog("Please enter the price of the house");
                inputPrice = Double.parseDouble(inputPriceAsString);
                House newHouse3 = new House("Ian's House", "Bungalow", inputPrice, "Ian O'Regan", 25, 'M');

                JOptionPane.showMessageDialog(null, newHouse3.toString());
            }
            else
            {
                House newHouse3 = new House("Ian's House", "Bungalow", inputPrice, "Ian O'Regan", 25, 'M');

                JOptionPane.showMessageDialog(null, newHouse3.toString());
            }

System.exit(0);


    }
}
