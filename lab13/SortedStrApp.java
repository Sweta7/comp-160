/** SortedStrApp.java    
  * to produce sorted string and check if they anagram of each other 
  * application class with main method       
  * java Lab 13,COMP160  2017        
  */     
import java.util.Scanner;  
/** to enter string from user and check if they are anagram*/  
public class SortedStrApp{        
  public static void main(String[]args){  
    Scanner scan = new Scanner(System.in);  
    System.out.println("Enter first phrase");  
    String s1 = scan.nextLine().toLowerCase(); // first string from user
    System.out.println("Enter second phrase");  
    String s2 = scan.nextLine().toLowerCase(); // second string from user
    String order1= phrase(s1); // an string object made which will store method phrase
    String order2= phrase(s2); // an string object made which will store method phrase
    System.out.println(order1 + "  are the letters of "+s1 + " in order");
    System.out.println(order2 + " are the letters of "+s2 + " in order");
    if(order1.equals(order2)){ 
      System.out.println(s1 + " is an anagram of " + s2);  
    } 
    
  } 
 /** method phrase to check letter from a to z and store alphabet order in String name "emptys"*/   
  public static String phrase(String s){ 
    String emptys="";  
    for(char letter='a'; letter<='z'; letter++){  
      for(int index=0; index<s.length(); index++){  
        if (s.charAt(index)==letter){  
          emptys += letter;      
        }          
      }   
    } 
    return emptys; 
    
  } 
   
} 


