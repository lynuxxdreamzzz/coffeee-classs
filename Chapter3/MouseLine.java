public class MouseLine{
    //Instance variable declarations
    private int position;
    private int move=1;
    public MouseLine(int initialPosition)
    {
        position=initialPosition;
    }
    public int getPosition(){
        return position;
    }
    public void move(){
        position+=move;
    }
    public void turn(){
        move*=-1;
    }
}