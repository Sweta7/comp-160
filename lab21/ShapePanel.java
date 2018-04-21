import java.awt.*;     
import javax.swing.*;    
import java.awt.event.*;    

/** ShapePanel class ceated containing 20 shape object in array */    
public class  ShapePanel extends JPanel{    
  Shape [] shapes = new Shape [20]; 
  DrawingPanel drawPanel= new DrawingPanel (); 
  private JPanel controlPanel; 
  private JButton addShape; 
  private JTextField showNum; 
  private JLabel countLabel; 
  private int count; 
  
  /** Constructor of ShapePanel class  */    
  public ShapePanel(){      
    addShape= new JButton ("Add Shape");    
    showNum= new JTextField (2);       
    countLabel= new JLabel ("Count");      
    ButtonListener listner = new ButtonListener();   
    addShape.addActionListener(listner);     
    controlPanel = new JPanel();    
    controlPanel.setPreferredSize(new Dimension(100,400));    
    //controlPanel.setBackground(Color.white);    
    controlPanel.add(addShape);   
    controlPanel.add(showNum);    
    controlPanel.add(countLabel);      
    add(controlPanel);   
    add(drawPanel);   
  }     

  /** creates  an instance of the class, puts it on a frame and sets some essential parameters.*/   
  public static void main(String[]args){   
    JFrame frame = new JFrame("ShapePanelApp"); // created new Jframe   
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//   
    frame.getContentPane().add (new ShapePanel()); // add JPanel object to JFrame object   
    frame.pack(); // wrap ("pack") JFrame object around JPanel object   
    frame.setVisible(true);// set visible   
  }   
  
  
  private class DrawingPanel extends JPanel{  
    public DrawingPanel(){   
      setPreferredSize(new Dimension(400,400));    
      setBackground(Color.pink);   
    }   
    
    /** draw method of each ShapePanel object, paaisng the Graphic object"g"*/    
    public void paintComponent(Graphics g){     
      super.paintComponent(g);     
      for(int i = 0; i < count; i++){ 
        shapes[i].display(g); 
      }   
    }  
  }  
  
 
  /**action performed method to set shape */    
  private class ButtonListener implements ActionListener{    
    public void actionPerformed (ActionEvent event){ 
      
      if(event.getSource()== addShape){  
        if (count< shapes.length) {
          shapes[count]=new Shape();
          count++; 
        } 
      }
      showNum.setText(Integer.toString(count)); 
      repaint(); 
      
    } 
    
  } 
}






