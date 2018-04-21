/* creating support class Box which will calculate
 * volumeand surface are
 */

/** data field declared*/
public class Box{
  private int height;
  private int width;
  private int length; 
  
  /**sets the value of the data field height to input parameter value*/
  public void setHeight(int h){
    height = h;
  } //end method
  /**sets the value of the data field width to input parameter value*/
  public void setWidth(int w){
    width = w;
  }
  /**sets the value of the data field length to input parameter value*/
  public void setLength(int l){
    length = l;
  }
  /**no need to put any parameter inside bz it will take data field value*/
  public int getSurfaceArea(){ 
    return (2*height*length + 2*width*height + 2*length*width);
  }
  /**no need to put any parameter inside bz it will take data field value*/ 
  public int getVolume(){ // 
    return (height*width*length);
  }
  /**returns the value of the data field title */
  public String toString(){
    return ("Height is: " + height + "," + "Length is:" + length + "," + "Volume is: " + getVolume() + ","  + "Surface area is: "+ getSurfaceArea() );
  }
  /**first Constructor with 3 parameters */
  public Box(int h, int w, int l){ 
    height = h;
    width = w;
    length = l;
  }// end method
  /** default second constructor*/
  public Box(){ 
  }
  /** step 15 to write third constructor with oly one input parameter*/
  public Box(int side){ 
    height = side;
    width = side;
    length = side;
  }// end method

}
    
  
