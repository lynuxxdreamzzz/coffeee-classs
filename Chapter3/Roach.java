/**
    Insert documentation
 */
public class Roach{
    //Instance variable declarations
    private int roaches=0;
    public Roach(int roachesIn)
    {
        roaches=roachesIn
    }
    public int getRoaches(int size){
        return roaches;
    }
    public void breed(){
        roaches*=2;
    }
    public void spray(double percent){
        roaches=roaches-.01*percent*roaches;
    }

}