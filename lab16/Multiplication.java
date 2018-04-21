/** Application class for Multiplication
  * COMP160 lab16
  * 2-D array for 12*12
  */
public class Multiplication{
 public static void main(String[]args){
   int[] [] table= new int [12][12];
   for(int row=0;row<table.length;row++){
     for(int col=0; col<table.length;col++){
       table[row][col]= (row +1)*(col+1);
       //System.out.print( table[row][col] +"\t");
     }
   }
     for (int [] row:table){ // foreach loop to print everything in table array
       for(int x:row){
        System.out.print(x +"\t"); 
   }
       System.out.println();
 }
}
}