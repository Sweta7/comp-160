 /** how to call different method and use scanner class to use user input.
   * also to check if the order of method changes the program output.
 * Lab 3, COMP160, 2017
 */

import java.util.Scanner;
public class Fish{
 
  public static void main(String [] args){
    Scanner scan = new Scanner (System.in); // for user input.
    System. out.println("Enter verse 4 text:");
    String verse4 = scan.nextLine();
    String verse3 = "This one has a little star.\n ";
    printVerse1(); 
    printVerse2(); 
    printVerse(verse3);
    printVerse(verse4);
 
  
  }//end main

  
  /** declares a String variable called verse1 and displays it on the screen*/
  public static void printVerse1(){
    String verse1 = "One fish\nTwo fish\nRed fish\nBlue fish.\n"; // verse1 and verse2 are actual parameters
    System.out.println(verse1);
  }//end printVerse1
  
  /** declares string variable verse2 and dispalays  on the screen */
   public static void printVerse2(){
    String verse2 = "Black fish\nBlue fish\nOld fish\nNew fish";
    System.out.println(verse2);
  }//end printVerse2
  
     /** declares string variable verse and dispalays  on the screen */
   public static void printVerse(String verse){  // string verse is a formal parameter
    System.out.println(verse);
  }//end printVerse
   

}//end class
