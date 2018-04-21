/** Application class for FruitArray
  * COMP160 lab16
  * to take 3 fruits name from user and put in String type array
  */

import java.util.Scanner; 
public class FruitArray{
  public static void main(String[]args){
    String [] fruits = new String [3];
    Scanner scan =new Scanner(System.in);
    for(int enter=0; enter<fruits.length;enter++){
      System.out.println("Please enter a fruit name");
      String enterName=scan.nextLine();
      fruits[enter]=enterName;
    }
    
    
    for(String name:fruits){
      System.out.println("Guess what fruit i am? " + name.substring(0,2) +" "+ name.length() + " letters");
      
      String enterGuess ; 
      do{
        Scanner scan1 =new Scanner(System.in);
        System.out.println("Please enter your guess");
        enterGuess=scan1.nextLine();  
        if(!enterGuess.equals(name))
           System.out.println("Try again");
      }while(!enterGuess.equals(name));
      System.out.println("Correct");
    }
 
  } 
}
