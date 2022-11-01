/**
 *
 * @author smiley
 */
public class Sheep extends Animal
{
    private String color;

    public Sheep()
    {
        super();
        color = "Black";
    }
    
    public Sheep(String c)
    {
        super();
        color = c;
    }
    
    public Sheep(String n, int a, String c)
    {
        super(n, a);
        color = c;
    }
    
    @Override
    public String talk()
    {
        return "Sheep: Baaa";
    }
    
    @Override
    public String toString()
    {
        return "Class: Sheep - " + super.toString() + " - Color:" + color;
    }
}
