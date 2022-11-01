/*
    Animal.java
    Foundation class for Petting Zoo Example
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Animal
{

    private String name;
    private Integer age;
    private int location;
    private final ArrayList<String> cageLocations = new ArrayList<>(Arrays.asList("Pen", "Foyer", "Field", "Atrium 1", "Atrium 2"));
    private Random myRand = new Random();
    
    public Animal()
    {
        name = null;
        age = 0;
        move();
    }

    public Animal(String n, int a)
    {
        name = n;
        age = a;
        move();
    }

    public String talk()
    {
        return "Animal: Talking";
    }

    public void move()
    {
        location = myRand.nextInt(cageLocations.size() - 1);
    }

    public String getLocation()
    {
        return cageLocations.get(location);
    }

    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * @return the age
     */
    public Integer getAge()
    {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(Integer age)
    {
        this.age = age;
    }

    @Override
    public String toString()
    {
        return ("Name: " + name + " - Age: " + age + " - Cage: " + cageLocations.get(location));
    }
}
