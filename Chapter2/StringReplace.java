public class StringReplace{
    public static void main(String[] args){
        String tn="Tennessee";
        String firstReplace=tn.replaceAll("e","pp");
        String secondReplace=firstReplace.replaceAll("pp","s");
        System.out.println(firstReplace+':'+firstReplace.length());
        System.out.println(secondReplace+':'+secondReplace.length());
    }
}