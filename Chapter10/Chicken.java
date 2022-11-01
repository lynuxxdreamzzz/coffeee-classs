/**
 *
 * @author smiley
 */
public class Chicken extends Animal
{
    public Chicken()
    {
        super();
    }
    
    public Chicken(String n, int a)
    {
        super(n, a);
    }
    
    @Override
    public String talk()
    {
        return "Chicken: BockBock";
    }
    
    public String toString()
    {
        return "Class: Chicken - " + super.toString();
    }

}
