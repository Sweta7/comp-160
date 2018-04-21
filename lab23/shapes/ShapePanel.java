package shapes; 


import java.awt.*;       
import javax.swing.*;      
import java.awt.event.*;      


/** ShapePanel class ceated containing 20 shape object in array */      
public class  ShapePanel extends JPanel{      
  Shape [] shapes = new Shape [20];  
  JButton [] buttons = { new JButton("Circle"), new JButton("Square"), new JButton("Oval"), new JButton("Smiley"),  
    new JButton("Swirl"), new JButton("Start"), new JButton("Stop") };  
  DrawingPanel drawPanel= new DrawingPanel ();   
  private JPanel controlPanel;     
  private JTextField showNum;   
  private JLabel countLabel;   
  private int count;  
  Timer timer; 
  private final int  DELAY=20; 
  
  /** Constructor of ShapePanel class  */      
  public ShapePanel(){        
    showNum= new JTextField (2);         
    countLabel= new JLabel ("Count");        
    ButtonListener listner = new ButtonListener();     
    controlPanel = new JPanel(); 
    for (JButton button : buttons) { 
      button.addActionListener (listner); 
      controlPanel.add (button); 
    } 
    
    timer = new Timer(DELAY,listner); 
    
    controlPanel.setPreferredSize(new Dimension(100,400));      
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
      if(event.getSource()== timer){    
        for(int i = 0; i < count; i++){   
          shapes[i].move();   
        }
      }else {
        
        JButton button = (JButton) event.getSource();
        if (button.getText().equals ("Circle")){
          if (count< shapes.length) {  
            shapes[count]=new Circle();
            count++;   
          }   
        }  
        
        if(button.getText().equals ("Square")){
          if (count< shapes.length) {  
            shapes[count]=new Square(); 
            count++;   
          }   
        } 
        if(button.getText().equals ("Oval")){
          if (count< shapes.length) {  
            shapes[count]=new Oval();
            count++;   
          }   
        }  
        if(button.getText().equals ("Smiley")){
          if (count< shapes.length) {  
            shapes[count]=new Smiley();
            count++;   
          }   
        }  
        if(button.getText().equals ("Swirl")){
          if (count< shapes.length) {  
            shapes[count]=new Swirl();
            count++;   
          }   
        } 
        if(button.getText().equals ("Stop")){
          timer.stop(); 
        }        
        if(button.getText().equals ("Start")){
          timer.start(); 
        }
      }  
      
      showNum.setText(Integer.toString(count));   
      repaint();  
    } 
  } 
} 