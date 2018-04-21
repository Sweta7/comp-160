 
/** SongApp.java      
  * application class for Customer     
  * java Lab 11,COMP160  2017      
  */    
public class SongApp{      
  public static void main(String[]args){   
    Song song1 = new Song ("While my guitar gently weeps");  
    System.out.println(song1); 
    song1.process();  
    Song song2 = new Song ("Let it be");  
    System.out.println(song2);  
    song2.process();  
    Song song3 = new Song ("Penny Lane");  
    System.out.println(song3);  
    song3.process();  
   }  
}  