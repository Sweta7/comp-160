package shapes; 
import java.util.*;    
import java.awt.*;        
import javax.swing.*;       
public abstract class Shape{    
  protected int x;    
  protected int y;    
  protected int width;    
  protected int height;    
  protected Color colour;  
  int moveX=1; 
  int moveY=1; 
  int input;
    
  /** constructor for shape created*/    
  public Shape (){    
    width= randomRange (10, 30);    
    height= width;    
    x= randomRange (0, (400-width));    
    y = randomRange (0, (400-height));  
    if(y>200) 
      moveY=-moveY;   
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
    
  public abstract void display(Graphics g);   

  
  /** to move circle*/  
  public void move(){ 
    x= moveX+x; 
    y= moveY+y; 
    if(x<=0|| x>400-width){ 
      moveX=-moveX; 
    }
    if(y<0||y>400-height) {
      moveY=-moveY; 
    }
    if(width>15){
      moveX=-moveX;
    }else 
      moveY=-moveY;
   
}
 
  public void showIndex (Graphics g, int input){
    g.setColor(Color.black); 
    g.setFont(new Font("Courier", Font.PLAIN,10)); 
    g.drawString(Integer.toString(input),x+15,y+20 );
  }
  
}