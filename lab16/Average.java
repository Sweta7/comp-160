public class Average{
  public static void main(String[]args){
    int[] [] table= {{1,2,3,},{4,5,6},{7,8}};
    
    for(int row=0; row<table.length; row++){
      double sum=0;
      for(int col=0; col<table[row].length; col++){
        System.out.print(table[row][col] ); 
        sum+=(table[row][col]);
      }
      System.out.println(" Average : " +sum/table[row].length);
      System.out.println();
    }
   
   
//    for(int [] row: table){
//       int sum =0;
//      for( int x:row){
//        System.out.print(x +" ");
//        sum+=x;
//  }
//       System.out.println(" Average : " +(double) sum/row.length);
//}
  }
}