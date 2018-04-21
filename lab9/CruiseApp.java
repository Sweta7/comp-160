/** CruiseApp.java    
  application class for Customer   
  java Lab 9,COMP160  2017    
  Displays potential customer and various discounts    
  */   
   
import java.util.Scanner;   
import java.text.NumberFormat;   
public class CruiseApp{    
  public static void main(String[]args){       
    //each Customer created with name, age, showed student ID card    
    Customer customer1 = new Customer("Aaron Stott",17, true);    
    Customer customer2 = new Customer("Betty Adams",17, false);    
    Customer customer3 = new Customer("Corin Child",16, true);    
    Customer customer4 = new Customer("Doris Stewart",25, true);    
    Customer customer5 = new Customer("Edmond Cheyne",12, false);    
    Customer customer6 = new Customer("Fiona Chaney",7, false);    
    Customer customer7 = new Customer("Ged Still-Child",16, true);    
    Customer customer8 = new Customer("Harry Adamson",20, false);  
    //each Customer created with ticket price meal price and total depending on condition
    confirmBooking(customer1);     
    confirmBooking(customer2);    
    confirmBooking(customer3);    
    confirmBooking(customer4);    
    confirmBooking(customer5);    
    confirmBooking(customer6);    
    confirmBooking(customer7);    
    confirmBooking(customer8);  
    //each Customer created for confirm booking
    showBooked(customer1);  
    showBooked(customer2); 
    showBooked(customer3); 
    showBooked(customer4); 
    showBooked(customer5); 
    showBooked(customer6); 
    showBooked(customer7); 
    showBooked(customer8); 
  }   
  
   /** Confirmbooking method, which calculate ticket, meal and total price*/ 
  public static void confirmBooking(Customer customer){    
    NumberFormat fmt = NumberFormat.getCurrencyInstance(); // for formatting price   
    double standardTicketPrice=56.0;   
    double standardMealPrice =30.0; 
    
    if(customer.isStudent() || customer.isChild()){   
      standardTicketPrice = standardTicketPrice/2.0;   
    }else{standardTicketPrice = standardTicketPrice- (standardTicketPrice*0.2);   
    }   
    if(customer.isChild()){   
      standardMealPrice = standardMealPrice/2.0;   
    }else{standardMealPrice = standardMealPrice-(standardMealPrice*0.1);  
    }  
    System.out.println(customer.getName() + " " + "Ticket price: " + fmt.format(standardTicketPrice) +" "+"Meal price: "+ 
                       fmt.format(standardMealPrice)+" "+"Total price: "+(fmt.format(standardTicketPrice + standardMealPrice)));  
    Scanner scan = new Scanner (System.in);   
    System.out.println("Confirm booking for " + customer.getName() + " (Y or y)");   
    String s = scan.nextLine();   
    if(s.equals("Y")|| s.equals ("y")){  
      customer.setBooked(); 
      System.out.println( "Booked");  
    }   
  } 
  public static void showBooked(Customer customer){ 
    if(customer.isBooked()){ 
      System.out.println(customer.getName() +" is booked"); 
    }
  }
}

