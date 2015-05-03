package javafinalproject;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;


public class LinesJPanel extends JPanel{
    
    private final int ANIMATION_DELAY = 1; // 10 milisecond delay
    Timer animationTimer = new Timer( ANIMATION_DELAY, new TimerHandler() ); // timer so we can paint over and over
    Color colorArray[] = {Color.RED,Color.GREEN,Color.BLUE,Color.YELLOW,Color.BLACK,Color.MAGENTA};// array constructor
   
    private Oval myOval = new Oval(this); //make a new oval for this frame
    private Oval myOval2 = new Oval(this); //make a new oval for this frame
    private Star mystar = new Star(this); // make a new star for this frame
   


     public LinesJPanel() {

       animationTimer.start(); // Start timer
     }// end constructor
     
    @Override
    public void paintComponent(Graphics g)
    {        
        super.paintComponent(g);
        this.setBackground(Color.WHITE);
         this.myOval.draw(g); // this paints the circle
         this.myOval2.draw(g);
        this.mystar.paint(g); // this paints the star

    }//end method paintComponent
    
   
    private class TimerHandler implements ActionListener
    {
        // respond to Timer's event
        @Override
        public void actionPerformed( ActionEvent actionEvent )
        {
            
            repaint();
        } 
    }// end class TimerHandler

  
}//end class
