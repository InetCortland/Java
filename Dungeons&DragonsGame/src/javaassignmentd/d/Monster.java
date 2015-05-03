
package javaassignmentd.d;

import javax.swing.JOptionPane;

public class Monster extends Actor {
    
public int intDmg = 5;
// default damage


    public Monster(String sName, int intHp){
     super(sName,intHp);
     this.stringName=sName;
     this.intHp=intHp;
     
     // sets the values to the correct vars
   }

public int getDmg(){
// get the monster damage
return intDmg;

}

    @Override
    public void sendInfo() {
        JOptionPane.showMessageDialog(null, "A Monster has been created.");
// Abstract method
        
        
        
    }
  
}
