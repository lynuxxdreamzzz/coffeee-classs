/**
 *
 * @author smiley
 */
public class Camel extends Animal
{
    @Override
    public String talk()
    {
        return "Camel: Spit";
    }
    
    public String toString()
    {
        return "Class: Camel - " + super.toString();
    }
    
}
