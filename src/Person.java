public class Person
{

    private String name;
    private int age;
    private char gender;


    //accessor methods



    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public char getGender()
    {
        return gender;
    }

    //mutator methods
    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setGender(char gender)
    {
        this.gender = gender;
    }



    //constructors
    //example of method overloading??
    public Person(){
        this ("Unknown",0,'u');
    }


    public Person(String n,int age,char g){
        //setting attributes values directly)
        this.name=n;
        this.age=age;
        this.gender=g;
    }


    public Person(String name){
        //setting attributes values indirectly
        setName(name);
        setAge(0);
        setGender('u');
    }

    public Person(String name,int age){
        //setting attributes values directly)
        setName(name);
        setAge(age);
        setGender('u');
        //this(name,age,'u');
        
    }





    @Override
    public String toString() {
        return "Name: " +getName() +"\n" + "Age: " + getAge() +"\n" + "Gender: " + getGender()+ "\n";
    }





}