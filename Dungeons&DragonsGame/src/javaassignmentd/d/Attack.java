
package javaassignmentd.d;

import java.util.*;

public class Attack {
    
    int intRolled=0;
    Random randomGenerator = new Random();
    
    
    
    
    public int getAttack(int input){

        //take the input and roll a value
   intRolled = randomGenerator.nextInt(5);
        intRolled=input+intRolled;
return intRolled;

}
    
    
    
    
    
    
    
    
}
