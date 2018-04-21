/** LeapYearApp.java application class
  * Lab 10,COMP160  2017 
  * Displays leap year 
  */
public class LeapYearApp{
  //each leapYear created with year
  public static void main(String[]args){ 
    leapYear(2014);
    leapYear(2016);
    leapYear(1900);
    leapYear(2000);
    leapYear(1565);
  }
  // condition declared for leapyear
  public static void leapYear(int year){
    if (year<=1565){
      System.out.println(year + ": predates the Gregorian calender");
    }else if(year%4==0 && !(year%100==0)){
      System.out.println(year + ": is a leap year");
    }else if(year%400==0){
      System.out.println(year + ": is a leap year");
    }else{
      System.out.println(year + ": is not a leap year");
    }
  }
}



     