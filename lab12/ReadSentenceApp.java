/** ReadSentenceApp.java      
  * application class with main method     
  * java Lab 12,COMP160  2017      
  */   
import java.util.Scanner;
/* to enter string from user and count vowel and consonant*/
public class ReadSentenceApp{      
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a sentence");
    String s = scan.nextLine().toLowerCase();
    char grade = s.charAt(0);
    int vCount = 0;
    int cCount = 0;
    int index= 0;
    System.out.println("Sentence is : " + s);//printed sentence.
    while(index<s.length()){ //if index is less than s.length
      grade = s.charAt(index);
      if(grade>='a'&& grade<='z'){ //if character are between a to z
        switch(grade){ // to check vowel
          case 'a': 
          case 'e':
          case 'i':
          case 'o':
          case 'u':
            vCount++;
            break;
          default: // to check consonant
            cCount++;   
        }  
      }
      
      index++; // index increased by one
    }
    System.out.println("vowel : " + vCount);
    System.out.println("Consonant : " + cCount);
    
  }
}

