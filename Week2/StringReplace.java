public class StringReplace{
    public static void main(String[] args){
        String tn="Tennessee";
        String firstReplace=tn.replaceAll("e","pp");
        String secondReplace=firstReplace.replaceAll("pp","s");
        System.out.println(firstReplace+"\tLength:"+firstReplace.length());
        System.out.println(secondReplace+"\tLength:"+secondReplace.length());
    }
}