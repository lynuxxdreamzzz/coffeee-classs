public class RoachSimulation{
    public static void main(String[] args){
        RoachSimulation rs=new RoachSimulation(10);
        System.out.println("Current number of roaches is "+rs.getRoaches());
        for(int i=0;i<4;i++){
            rs.breed();
            System.out.println("Roaches bred, time to spray.");
            rs.spray(10);
            System.out.println("Current number of roaches is "+rs.getRoaches());
        }
        
    }
}