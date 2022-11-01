/**
 *
 * @author smiley
 */
public class Dog extends Animal
{
    private String color;

    public Dog()
    {
        super();
        color = "Black";
    }
    
    public Dog(String c)
    {
        super();
        color = c;
    }
    
    public Dog(String n, int a, String c)
    {
        super(n, a);
        color = c;
    }
    
    @Override
    public String talk()
    {
        return "Dog: Arfarf!";
    }
    
    public String toString()
    {
        return "Class: Dog - " + super.toString() + " - Color:" + color;
    }
}
