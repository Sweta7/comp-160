import java.util.*;  
import java.awt.*;      
import javax.swing.*;     
public class Shape{  
  private int x;  
  private int y;  
  private int width;  
  private int height;  
  private Color colour;  
  
  /** constructor for shape created*/  
  public Shape (){  
    width= randomRange (10, 30);  
    height= width;  
    x= randomRange (0, (400-width));  
    y = randomRange (0, (400-height));  
    int red=randomRange (0, 255);  
    int green=randomRange (0, 255);  
    int blue=randomRange (0, 255);  
    this.colour = new Color(red, green, blue);  // data field colour is set random colour
  }  
  
   /** randomRange method create random number*/ 
  public int randomRange(int lo, int hi){  
    Random generator = new Random();  
    return generator.nextInt(hi-lo+1)+lo;  
  }  
  
  /** to display shape and color*/ 
  public void display(Graphics g){  
    g.setColor(colour); 
    g.fillOval(x,y, width, height); 
    
  } 
} 