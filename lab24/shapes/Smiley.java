package shapes; 
import java.awt.*;  
public class Smiley extends Shape{ 
 
  public Smiley(){
    height= 30;
    width= 30;
  }
    
   public void display(Graphics g){    
    g.setColor(Color.yellow);   
    g.fillOval(x,y, width, height);
    g.setColor(Color.black);   
    g.drawOval(x+7,y+8, 4, 4); 
    g.drawOval(x+20,y+8, 4, 4);  
    g.drawArc(x+8,y+10, 15,13,190,160);
      
  }  
}