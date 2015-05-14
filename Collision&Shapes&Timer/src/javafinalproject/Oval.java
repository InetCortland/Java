
package javafinalproject;

import java.awt.Graphics;
import java.util.Random;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class Oval {
    //properties
    
   int xVelocity = 1;
   int yVelocity =1;
   private final JPanel screenSize;
   
   Random myRandom = new Random();
   
   
    private int a = 50;
    private int b = 50;
    
    
    
    private int x = 500;
    private int y = 50;
    int dia = 15;

    public int intHeight=0;
    public int intWidth=0;
    
      int color = 0;            
      Color colorArray[] = {Color.RED,Color.GREEN,Color.YELLOW,Color.BLACK};// array constructor
      



    public Oval(JPanel passedSize) 
    {    
        xVelocity = myRandom.nextInt(3)+1;
        screenSize = passedSize; // need this to get size of frame
    }//end ball constructor

    public void draw(Graphics g)
    {
            color = myRandom.nextInt(1);
            Dimension d = screenSize.getSize(); // get size of our frame
            intHeight=d.height;
            intWidth=d.width;
		x += xVelocity; // x speed
		y += yVelocity; // y speed

                // Arguments to find out where the ball should go
		if (x < 0)
                { 
                    a = 80;  // random changes
                    b = 80;
                    x = 0; 
                    xVelocity = -xVelocity;
                }
		if (x + a >= d.width)
                {
                    a = 100;
                    b = 100;
                    x = d.width - a; xVelocity = -xVelocity; 
                }
                if (y < 0)
                {
                    a = 50;
                    b = 50;
                    y = 0; yVelocity = -yVelocity;
                }
 		if (y + b >= d.height)
                {
                       a = 20;   // More random changes
                       b = 20;
                       y = d.height - b; yVelocity = -yVelocity;
                }
             
                
            g.setColor(colorArray[color]); // This gives us the multi color effect
            g.fillOval(x,y,a,b);
    }
    
    
  
}//end class
