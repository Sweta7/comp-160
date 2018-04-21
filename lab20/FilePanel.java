/** FilePanel.java 
  * Lab 20, COMP160,  2016 
  *  
  * a JPanel which creates 2 instances of Rectangle objects,  
  * stores them in an array, and draws them  
  */ 


import java.awt.*; 
import javax.swing.*; 
import java.io.*; 
import java.util.Scanner; 


public class FilePanel extends JPanel{ 
  private Rectangle[] drawObjects = new Rectangle [10]; 
  private int count; 
  
  
  /**constructor instantiates 6 Rectangle objects*/ 
  public FilePanel(){   
//    drawObjects[count] = new Rectangle(true,Color.red, 0, 0,30,30); 
//    count++; 
//    drawObjects[count] = new Rectangle(false,Color.blue, 50, 50,30,30); 
//    count++; 
    setPreferredSize(new Dimension(300,300)); 
    setBackground(Color.yellow); 
    
    //String fileName=("Lab20data.txt"); 
    //String fileName=("BadData.txt");
    String fileName=("LongBadData.txt");
    try { 
      Scanner fileScan = new Scanner(new File(fileName) );
      
      while (fileScan.hasNextLine() && count< drawObjects.length) { 
        String inputLine = fileScan.nextLine();
        if (inputLine.matches("\\d+ \\d+ \\d+ \\d+ \\d+ \\d+")){
          Scanner scan1= new Scanner(inputLine);                    
          int fill = scan1.nextInt();// read fill 
          int color = scan1.nextInt();// read color 
          int x = scan1.nextInt(); 
          int y = scan1.nextInt(); 
          int width = scan1.nextInt(); 
          int height = scan1.nextInt();   
          System.out.println(" \n" + fill+ color+ x+ y+ width+height); 
          boolean fillb=false;
          
          if (fill==1){ 
            fillb = true; 
          } 
          
          Color colorb= Color.black;
          
          if (color==1){ 
            colorb = Color.red; 
          } else if (color==2){
            colorb = Color.blue; 
          } else if (color==3){
            colorb = Color.green; 
          }
          
          drawObjects[count] = new Rectangle(fillb,colorb, x, y,width,height); 
          count++;
        }
      }
      
    } catch (FileNotFoundException e) { 
      // some problem with the file (not found?) 
      System.out.println("File not found. Check file name and locaton." ); 
      System.exit(1); 
    }  
  } 
  
  /**each Rectangle will draw itself*/ 
  public void paintComponent(Graphics g){ 
    super.paintComponent(g); 
    for(int i = 0; i < count; i++){ 
      drawObjects[i].draw(g); 
    }  
  } 
}