


package javaassignmentd.d;

public abstract class Actor{
    
protected int intHp;
protected String stringName;
    
public Actor(String sName, int intHP){
        this.stringName= sName;
        this.intHp= intHP;
        // constructor
    }
 
public String getName(){
// reutn the given name
return stringName;

}

 public int getHp(){
// return the given hp
return intHp;

}
 
public abstract void sendInfo();



 
 
}
