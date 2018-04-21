
/** EvenApp.java        
  * application class with main method       
  * java Lab 12,COMP160  2017        
  */     
import java.util.Scanner;  
/* to add 2 and all the intered value by user using Scanner class*/  
public class EvenApp{        
  public static void main(String[]args){  
    Scanner scan = new Scanner(System.in);  
    System.out.println("Enter an integer greater than 1");  
    int enterValue = scan.nextInt(); 
    if (enterValue > 1) { 
      // int value;  
      int sum = 0; 
      for (int value=2;value <= enterValue; value+=2) { 
       // if (value%2==0) 
          sum= sum+ value; 
      } 
      System.out.println("The sum of even numbers between 2 and " + enterValue +" inclusive is " + sum); // sum of 2 and entered value printed.
    } else { 
      System.out.println("Input value must not be less than 2");// if entered vlaue less than 1 error  
      
    } 
  } 
} 