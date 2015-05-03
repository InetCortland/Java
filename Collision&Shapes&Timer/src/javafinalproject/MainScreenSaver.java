/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javafinalproject;

import java.awt.Color;
import javax.swing.JFrame;


public class MainScreenSaver {

    
    /**LinesJPanel linesJPanel = new LinesJPanel();
     * @param args the command line arguments
     */
  public static void main(String[] args) {
    
      
      // New frame with the name Screen Saver
      JFrame frame = new JFrame("Screen Saver");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      LinesJPanel linesJPanel = new LinesJPanel(); // the main object
       linesJPanel.setBackground(Color.WHITE);
      frame.add(linesJPanel);
      frame.setSize(1000,800);// size of the frame
      frame.setVisible(true);  // set it visible so we can see it

    }
}
