public class Song{  
  private String songLine;  
  
   /* */ 
  public Song( String sLine){  
    songLine = sLine;  
  }  
  /* toString method created which return variable songLine*/  
  public String toString(){  
    return songLine;  
  }  
    
  public void process(){  
    int space1= songLine.indexOf(' '); // variable of first space created 
    int space2= songLine.indexOf(' ', space1+1);   // variable of second space created 
    int songLength= songLine.length(); // variable of song.length created
    System.out.println("Length is: "+ songLength); // print length of a string 
    System.out.println("last character of a string: " + songLine.charAt(songLength-1));  // print last character of a string
    if (space2==-1){
      System.out.println(songLine);// if second space is not present then if command to print first two word
    }else{ 
      System.out.println(("first two words in one line and second word in nextline:" + songLine.substring (0, space2)+"\n" + songLine.substring(space2+1))); // print first two words in one line and second word in nextline
    }
    System.out.println("first letter of third word: "+songLine.charAt(space2+1));  // print first letter of third word
    System.out.println(" first letter of third word: " + songLine.toUpperCase());  // print first letter of third word
    System.out.println("replace space with x:" +songLine.replace(' ','x'));  // replace space with x
    System.out.println(songLine.indexOf("index of letter b: " +'b'));  // print index of letter b
//    System.out.println(songLine);  
                         
  }  
}  
 