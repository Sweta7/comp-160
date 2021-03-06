package shapes; 

import java.util.ArrayList;
import java.awt.*;       
import javax.swing.*;      
import java.awt.event.*;      


/** ShapePanel class ceated containing 20 shape object in array */      
public class  ShapePanel extends JPanel{      
  ArrayList<Shape> shapes = new ArrayList<Shape>();  
  JButton [] buttons = { new JButton("Circle"), new JButton("Square"), new JButton("Oval"), new JButton("Smiley"),  
    new JButton("Swirl"), new JButton("Start"), new JButton("Stop"), new JButton("Remove")};  
  DrawingPanel drawPanel= new DrawingPanel ();   
  private JPanel controlPanel;     
  private JTextField showNum;   
  private JLabel countLabel;   
  
  Timer timer; 
  private final int  DELAY=20; 
  
  /** Constructor of ShapePanel class  */      
  public ShapePanel(){  
    showNum= new JTextField (2); 
    countLabel= new JLabel ("Remove which ?");            
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
//      for(int i = 0; i < count; i++){   
//       ArrayList<Shape>.display(g);   
//      } 
      int input=0;
      for(Shape s: shapes){   
        s.display(g); 
        
        s.showIndex (g,input);
        input++;
      } 
    }    
  }    
  
  
  /**action performed method to set shape */      
  private class ButtonListener implements ActionListener{      
    public void actionPerformed (ActionEvent event){
      if(event.getSource()== timer){    
        for(Shape s: shapes){   
          s.move();   
        }
      }else {
        
        JButton button = (JButton) event.getSource();
        if (button.getText().equals ("Circle")){ 
          shapes.add (new Circle());
          
        }     
        if(button.getText().equals ("Square")){ 
          shapes.add (new Square()); 
          
        }  
        if(button.getText().equals ("Oval")){
          shapes.add (new Oval());
          
        }   
        if(button.getText().equals ("Smiley")){
          shapes.add (new Smiley());
          
        }   
        if(button.getText().equals ("Swirl")){
          shapes.add (new Swirl());
          
        }   
        if(button.getText().equals ("Stop")){
          timer.stop(); 
        }        
        if(button.getText().equals ("Start")){
          timer.start(); 
        }
        
        if(button.getText().equals ("Remove")){
          try{
            int rem= Integer.parseInt (showNum.getText());
            shapes.remove(rem);  
          }
          catch(NumberFormatException exception){
            System.out.println("its not a number");
          }
          catch(IndexOutOfBoundsException exception){
            System.out.println("text field is greater");
          }
        }

        if(shapes.size()==0){
          showNum.setText(" ");  
        }
        else
          showNum.setText(Integer.toString(shapes.size()-1));  
      }
      repaint(); 
    }
    
  }
} 


