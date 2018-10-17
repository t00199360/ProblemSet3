public abstract class Computer implements Memory, Laptop
{
    private String id;
    private String make;
   // protected Memory memory; OBJECTS FROM OTHER CLASSES
   // public Computer computer; OBJECTS FROM OTHER CLASSES

    //Accessor methods

    public String getMake()
    {
        return make;
    }

    public String getId()
    {
        return id;
    }

    //Mutator Methods


    public void setId(String id)
    {
        this.id = id;
    }

    public void setMake(String make)
    {
        this.make = make;
    }

    //no argument constructor
    public Computer()
    {
        this.id="unknown";
        this.make="unknown";
    }

    //2 argument constructor
    public Computer(String id, String make)
    {
        this.id=id;
        this.make=make;
    }

    //x argument constructor, includes the objects from the other classes

    //toString() method

    @Override
    public String toString() {
        return super.toString();
    }
}
