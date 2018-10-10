import javax.swing.*;

public class PersonDriver {
    public static void main(String[] args) {
        String name;
        int age;
        char gender;


        Person [] people = new Person[3];

        //enhanced for loop
        for (Person p: people){
            name= JOptionPane.showInputDialog("Enter Name");
            age = Integer.parseInt(JOptionPane.showInputDialog("Enter Age"));
            gender = JOptionPane.showInputDialog("Enter Gender").charAt(0);
            p = new Person(name,age,gender);
            System.out.println(p.toString());
        }
    }
}
