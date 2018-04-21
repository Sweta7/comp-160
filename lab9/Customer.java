/** Class Customer created which is support class for CruiseApp application class
  * lab9
  */ 
public class Customer{   
  private String name;   
  private boolean child;   
  private boolean student;   
  private boolean booked;   
  
  
//** Constructor for Customer created*/     
public Customer (String nameIn, int age, boolean studentIn){      
  name = nameIn;     
    child= (age >= 5 && age<=16);     
  student = studentIn;     
 }     
 
//** accessor for name created*/ 
public String getName(){      
  return name;     
}  
//** accessor for child created*/ 
public boolean isChild(){    
  return child;    
} 
//** accessor for student created*/ 
public boolean isStudent(){    
  return student;    
}
//** accessor for booked created*/ 
public boolean isBooked(){    
return booked;       
}   
//** mutator for booked created*/
public void setBooked(){   
  booked= true;  
}  
}  

 