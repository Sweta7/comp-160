//********************************************************************  
//  StyleOptionsPanel.java      adapted from Java Foundations  
//  
//  Demonstrates the use of check boxes.  
//********************************************************************  
  
  
import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
  
  
public class StyleOptionsPanel extends JPanel  
{  
  private JLabel saying;  
  private JCheckBox bold, italic;  
  private int style = Font.PLAIN;  
  private String typeFace = "Helvetica";  
  private JRadioButton courier, times, halvetica;  
    
  //-----------------------------------------------------------------  
  //  Sets up a panel with a label and some check boxes that  
  //  control the style of the label's font.  
  //-----------------------------------------------------------------  
  public StyleOptionsPanel()  
  {  
    setLayout(new GridLayout (6,1));  
    saying = new JLabel ("Say it with style!");  
    saying.setFont (new Font (typeFace, style, 20));  
      
    bold = new JCheckBox ("Bold");  
    bold.setBackground (Color.cyan);  
    italic = new JCheckBox ("Italic");  
    italic.setBackground (Color.cyan);  
    courier = new JRadioButton ("Courier");  
    times= new JRadioButton ("Times new Roman");  
    halvetica= new JRadioButton ("Halvetica");  
      
    StyleListener listener = new StyleListener();  
    bold.addItemListener (listener);  
    italic.addItemListener (listener);  
      
      
      
    StyleListener bl = new StyleListener();  
    ButtonGroup sizeGroup = new  ButtonGroup();  
    courier.addItemListener (bl);   
    times.addItemListener (bl);  
    halvetica.addItemListener (bl);  
    sizeGroup .add(courier);  
    sizeGroup .add(times);  
    sizeGroup .add(halvetica);  
      
      
    add (saying);  
    add (bold);  
    add (italic);  
    add(courier);  
    add(times);  
    add(halvetica);  
      
      
    setBackground (Color.cyan);  
    setPreferredSize (new Dimension(300, 100));  
  }  
    
  //*****************************************************************  
  //  Represents the listener for both check boxes.  
  //*****************************************************************  
  private class StyleListener implements ItemListener  
  {  
    //--------------------------------------------------------------  
    //  Updates the style of the label font style.  
    //--------------------------------------------------------------  
    public void itemStateChanged (ItemEvent event)  
    {  
      style = Font.PLAIN;  
        
      if (bold.isSelected())  
        style = Font.BOLD;  
        
      if (italic.isSelected())  
        style += Font.ITALIC;  
        
      if (courier.isSelected())  
        typeFace= "Courier";  
        
      if (times.isSelected())  
        typeFace = "Times new Roman";  
        
       if (halvetica.isSelected())  
         typeFace = "Halvetica";  
        
      saying.setFont (new Font (typeFace, style, 20));  
    }  
  }  
}