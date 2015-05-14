package javafinalproject;


import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import javax.swing.JPanel;

public class Star 
{
    

    // An array with all of the points for our star
    double[][] starPoints = { 
        { 55, 0 }, { 67, 36 }, { 109, 36 }, { 73, 54 }, 
        { 83, 96 }, { 55, 72 }, { 27, 96 }, { 37, 54 }, 
        { 1, 36 }, { 43, 36 }, { 43, 36 } 
    };
    
    // Velocitys
    int xVelocity =1;
    int yVelocity=1;
    
    private int xBasePoint = 0; // Starting X
    private int yBasePoint = 0; // Starting Y
    
    public int intHeight=0; // Height of the window frame
    public int intWidth=0; // width of the window frame
    private final JPanel screenSize;
   //  Dimension d = box.getSize();
     

    
    
    
 public Star(JPanel passedScreensize) 
	{    
            
            screenSize = passedScreensize; //we make this so we can check to see how large the frame is
 	}//end star constructor

public void draw(Graphics gfx) {
        Graphics2D g2d = (Graphics2D)gfx;
        
        
        
        intHeight= screenSize.getHeight();
        intWidth=screenSize.getWidth();

	xBasePoint += xVelocity; // adding to x
	yBasePoint += yVelocity;  // adding to y
                  
                
        // Star movement
        if (xBasePoint < 0)
            { 
               xBasePoint = 0; 
               xVelocity = -xVelocity;
            }
        if (xBasePoint + 100 >= intWidth)
            {
                xBasePoint = intWidth - 100;
                xVelocity = -xVelocity; 
            }
        if (yBasePoint < 0)
            {
                yBasePoint = 0;
                yVelocity = -yVelocity;
            }
        if (yBasePoint + 100 >= intHeight){
            yBasePoint = intHeight - 100;
            yVelocity = -yVelocity;
        }
       
            // general path
    GeneralPath star = new GeneralPath();
        
        star.moveTo(starPoints[0][0], starPoints[0][1]);
        
        g2d.translate(xBasePoint,yBasePoint); // make all points move to the point

        for (int k = 1; k < starPoints.length; k++) // draw our shape
        {
        star.lineTo(starPoints[k][0], starPoints[k][1]);
        }
        
        star.closePath();
        g2d.fill(star);
       
    }
}
