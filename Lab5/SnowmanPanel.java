import javax.swing.*;
import java.awt.*;
/**
 * SnowmanPanel.java       From: Lewis, DePasquale & Chase page 971 (page 835 2nd edition)
 * 
 * Demonstrates basic drawing methods and the use of color.
 * 
 */
public class SnowmanPanel extends JPanel{
  
  
  /** constructor method, sets up the Snowman panel */
  public SnowmanPanel(){
    setPreferredSize(new Dimension(300,220));
    setBackground(Color.cyan);
  }
  
  /**  Draws a snowman.*/
  public void paintComponent (Graphics page)
  {
    super.paintComponent(page);
    final int MID = 100;
    final int TOP = 50;
    page.setColor (Color.cyan);
    page.fillRect(0,0,300,220);  //background;
    
    page.setColor (Color.blue);
    page.fillRect (0, 175, 300, 50);  // ground
    
    page.setColor (Color.yellow);
    //page.fillOval (-40, -40, 80, 80);  // sun
    page.fillOval (250, -10, 80, 80);  // moved sun to upper right sun
    
    page.setColor (Color.white);
    page.fillOval (MID -20, TOP, 40, 40);      // head
    page.fillOval (MID - 35, TOP + 35, 70, 50);   // upper torso
    page.fillOval (MID - 50, TOP + 80, 100, 60);  // lower torso
    
    page.setColor (Color.black);
    page.fillOval (MID - 10, TOP + 10, 5, 5);   // left eye
    page.fillOval (MID + 5, TOP + 10, 5, 5);    // right eye
    
    //page.drawArc (MID - 10, TOP + 20, 20, 10, 190, 160);   // smile
    page.drawArc (MID - 10, TOP + 20, 20, 20, 0, 180);   // frown
    
    page.drawLine (MID - 25, TOP + 60, MID - 50, TOP + 40);  // left arm
    page.drawLine (MID + 25, TOP + 60, MID + 55, TOP + 60);  // right arm
    
    page.drawLine (MID - 20, TOP + 5, MID + 20, TOP + 5);  // brim of hat
    page.fillRect (MID - 15, TOP - 20, 30, 25);        // top of hat
    
    page.setColor (Color.red);
    page.fillOval (MID -5, TOP + 45, 10, 10);      // upper button
    page.fillOval (MID - 5, TOP + 60, 10, 10);   // lower button
    
   page.drawString("Sweta", 10, 10); // Write String (String name, x, y)
    
  }
}
