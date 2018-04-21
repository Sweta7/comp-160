public class B{
  private String s;
  public B (String s){
    this.s=s;
  }
  public String getS(){
    return s;
  }
}

public class C extends B{
  private int x;
  private String a;
  public C (int x,String a, String s){
    this.x=x;
    this.a= a;
    super(s);
    s = "Five";
      System.out. println("c: x is " +x);
  }
}
  