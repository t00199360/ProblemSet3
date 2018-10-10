public class House {
    private String address;
    private String type;
    private double price;
    private Person owner;

    //accessor methods


    public double getPrice() {
        return price;
    }

    public String getAddress() {
        return address;
    }

    public Person getOwner() {
        return owner;
    }

    public String getType() {
        return type;
    }

    //mutator methods

    public void setAddress(String address) {
        this.address = address;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    //toString method

    @Override
    public String toString() {
        String x = "Heres a house \nAddress: \t" + getAddress() + "\n" + getOwner().toString()+ "Price: \t€" + getPrice() + "\nType: \t" + getType();
        return x;
    }

//no argument constructor
    public House()
    {
        this.address=" No Address Specified ";
        this.owner=new Person(" No Owner Specified ");
        this.price=0.0;
        this.type=" No Type Specified ";
    }

    //4 argument constructor
    public House(String address, String type, double price, Person owner)
    {
        this.address=address;
        this.owner=owner;
        this.type=type;
        this.price=price;
    }
    //6 argument constructor
    public House (String address,  String type, double price,String name, int age, char gender)
    {
        setAddress(address);
        setType(type);
        setPrice(price);

        Person owner = new Person(name, age, gender);

        setOwner(owner);

    }



}
