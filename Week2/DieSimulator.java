import java.util.Random;
import java.util.Set;
import java.util.HashSet;

public class DieSimulator{
    public static void main(String[] args){
        Set<Integer> tester=new HashSet();
        while(tester.size()<6){
            Random die=new Random();
            int dieInt=die.nextInt(6)+1;
            String roll=String.format("Dice roll: %d",dieInt);
            System.out.println(roll);
            tester.add(dieInt);
        }
        System.out.println(tester);
    }
}
