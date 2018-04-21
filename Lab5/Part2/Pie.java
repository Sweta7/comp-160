import javax.swing.*;
import java.awt.*;
/**
 Pie.java
 Support class provided for Part 2, Lab5, COMP160 2017 
 */
public class Pie extends JPanel{
    /** constructor method, sets up the Pie panel */
  public Pie(){
    setPreferredSize(new Dimension(300,300));
    setBackground(Color.white);
  }
 
    
    /** all drawing code goes in the paint method, which is called automatically*/
    public void paintComponent (Graphics page){
      super.paintComponent(page);
      //your pie chart code goes here
    final int xCordinate = 100; // all these variables are constant in pie image. so if these value changed here all the arc will changed.
    final int yCordinate = 80;
    final int width = 150;
    final int height = 150;
    final int arcAngle = 45;
    page.setColor (Color.black);
    page.fillRect(0,0,400,300);  //background;
    page.setColor (Color.red);
    page.fillArc ( xCordinate +10, yCordinate -5, width,height,0,arcAngle); // moved arc little bit
    page.setColor (Color.yellow);
    page.fillArc (xCordinate, yCordinate, width,height,45,arcAngle);
    page.setColor (Color.green);
    page.fillArc (xCordinate, yCordinate, width,height,90,arcAngle);
    page.setColor (Color.blue);
    page.fillArc (xCordinate, yCordinate, width,height,135,arcAngle);
    page.setColor (Color.pink);
    page.fillArc (xCordinate, yCordinate, width,height,180,arcAngle);
    page.setColor (Color.lightGray);
    page.fillArc (xCordinate, yCordinate, width,height,225,arcAngle);
    page.setColor (Color.orange);
    page.fillArc (xCordinate, yCordinate, width,height,270,arcAngle);
    page.setColor (Color.cyan);
    page.fillArc (xCordinate, yCordinate, width,height,315,arcAngle);
    }
}
