public class MouseTester{
    public static void main(String[] args){
        MouseLine mousy=new MouseLine(10);
        mousy.move();
        System.out.println(String.format("Mouse's current position is %d.\nMouse's xpected position is 11.\n",mousy.getPosition()));
        mousy.turn();
        mousy.move();
        System.out.println(String.format("Mouse's current position is %d.\nMouse's xpected position is 10.\n",mousy.getPosition()));
        mousy.turn();
        mousy.move();
        System.out.println(String.format("Mouse's current position is %d.\nMouse's xpected position is 11.\n",mousy.getPosition()));
        mousy.turn();
        mousy.move();
        System.out.println(String.format("Mouse's current position is %d.\nMouse's xpected position is 10.\n",mousy.getPosition()));
        mousy.turn();
        mousy.move();
        mousy.move();
        System.out.println(String.format("Mouse's current position is %d.\nMouse's xpected position is 12.\n",mousy.getPosition()));
        mousy.turn();
        mousy.move();
        mousy.move();
        System.out.println(String.format("Mouse's current position is %d.\nMouse's xpected position is 10.\n",mousy.getPosition()));
        mousy.turn();
        mousy.move();
        mousy.move();
        mousy.move();
        mousy.move();
        System.out.println(String.format("Mouse's current position is %d.\nMouse's xpected position is 14.\n",mousy.getPosition()));
        mousy.turn();
        mousy.move();
        System.out.println(String.format("Mouse's current position is %d.\nMouse's xpected position is 13.\n",mousy.getPosition()));
        mousy.turn();
        mousy.move();
        System.out.println(String.format("Mouse's current position is %d.\nMouse's xpected position is 14.\n",mousy.getPosition()));
        mousy.turn();
        mousy.move();
        mousy.move();
        System.out.println(String.format("Mouse's current position is %d.\nMouse's xpected position is 12.\n",mousy.getPosition()));
    }
}