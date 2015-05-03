
package javaassignmentd.d;

import javax.swing.JOptionPane;

public class GameCharacter extends Actor {

    public GameCharacter(String sName, int intHp){
     super(sName,intHp);
     this.stringName=sName;
     this.intHp=intHp;
     // give the input values to the super abstract class
  
    }

    @Override
    public void sendInfo() {
        JOptionPane.showMessageDialog(null, "A Hero has been created.");
        // abstract method
    }
    
    
            
    
    
    
    
}
