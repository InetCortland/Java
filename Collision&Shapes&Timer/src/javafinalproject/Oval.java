
package javafinalproject;

import java.awt.Graphics;
import java.util.Random;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class Oval {
    //properties
   private JPanel box;
    private int a = 50;
    private int b = 50;
    private int x = 500;
    private int y = 50;
    int dia = 15;
    int dx = 1;
    int dy=1;
    public int intHeight=0;
    public int intWidth=0;
    Random myRandom = new Random();



    public Oval(JPanel b) 
    {    
        dx = myRandom.nextInt(3);
        box = b; // need this to get size of frame
    }//end ball constructor

    public void draw(Graphics g)
    {
            int color = 0;            
            
            Color colorArray[] = {Color.RED,Color.GREEN,Color.YELLOW,Color.BLACK};// array constructor
            color = myRandom.nextInt(1);
            Dimension d = box.getSize(); // get size of our frame
            intHeight=d.height;
            intWidth=d.width;
		x += dx; // x speed
		y += dy; // y speed

                // Arguments to find out where the ball should go
		if (x < 0){ 
                    a = 80;  // random changes
                    b = 80;
                   x = 0; dx = -dx;}
		if (x + a >= d.width){
                    a = 100;
                    b = 100;
                    x = d.width - a; dx = -dx; }
                if (y < 0){
                    a = 50;
                    b = 50;
                    y = 0; dy = -dy;}
 		if (y + b >= d.height){
                       a = 20;   // More random changes
                       b = 20;
                    y = d.height - b; dy = -dy;}
             
                
            g.setColor(colorArray[color]); // This gives us the multi color effect
            g.fillOval(x,y,a,b);
    }
    
    
  
}//end class
