import java.awt.Color;
import javax.swing.JFrame;


public class BasicColor 
{ 
    
    public static void main(String[] args) 
    { 
        JFrame frame = new JFrame(); 
        frame.setSize(200, 200); 

        Color myColor = new Color(50,100,150); 

        Color bright=myColor.brighter();
        String rgb=String.format("Brighter color RGB values\nRed:%d Green:%d Blue:%d",bright.getRed(),bright.getGreen(),bright.getBlue());
        System.out.println(rgb);

        frame.getContentPane().setBackground(myColor); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setVisible(true); 
    } 
}