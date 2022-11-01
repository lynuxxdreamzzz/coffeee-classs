/**
 *
 * @author smiley
 */
public class PettingZooAnimalFull 
{
    public static void main(String[] args)
    {
        Animal animal1 = new Animal();
        Animal animal2 = new Dog("Stewie", 2, "Brown");
        Animal animal3 = new Camel();
        Animal animal4 = new Chicken();
        Animal animal5 = new Sheep("Naomi", 6, "Orange");
        
        animal3.setName("Doogie");
        animal1.setAge(12);
        
        System.out.println(animal1.talk());
        System.out.println(animal2.talk());
        System.out.println(animal3.talk());
        System.out.println(animal4.talk());
        System.out.println(animal5.talk());
        
        System.out.println(animal1.toString());
        System.out.println(animal2.toString());
        System.out.println(animal3.toString());
        System.out.println(animal4.toString());
        System.out.println(animal5.toString());
    }
}
