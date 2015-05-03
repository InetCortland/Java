package javafinalproject;


import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import javax.swing.JPanel;

public class Star 
{
    
    private int x = 0;
    private int y=0;
    // An array with all of the points for our star
    double points[][] = { 
        { 55, 0 }, { 67, 36 }, { 109, 36 }, { 73, 54 }, 
        { 83, 96 }, { 55, 72 }, { 27, 96 }, { 37, 54 }, 
        { 1, 36 }, { 43, 36 }, { 43, 36 } 
    };
    
    // Starting speeds
    int dx =1;
    int dy=1;
    public int intHeight=0; // Height of the frame
    public int intWidth=0; // width of the frame
    private JPanel box;
 
   
    
    
   //  Dimension d = box.getSize();
     
 public Star(JPanel b) 
	{    
            box = b; //we make this so we can check to see how large the frame is
 	}//end star constructor

    public void paint(Graphics g) {
        
        intHeight= box.getHeight();
        intWidth=box.getWidth();
        Graphics2D g2d = (Graphics2D)g;
	x += dx; // adding to x
	y += dy;  // adding to y
                  
                
                // Star movement
        	if (x < 0){ 
                   x = 0; dx = -dx;}
		if (x + 100 >= intWidth){
                    x = intWidth - 100; dx = -dx; }
                if (y < 0){
                    y = 0; dy = -dy;}
 		if (y + 100 >= intHeight){
                    y = intHeight - 100; dy = -dy;}
       
        
        GeneralPath star = new GeneralPath();
        star.moveTo(points[0][0], points[0][1]);
      
        g2d.translate(x,y); // make all points move to the point

        for (int k = 1; k < points.length; k++) // draw our shape
         star.lineTo(points[k][0], points[k][1]);
        star.closePath();
        g2d.fill(star);
    }
}
