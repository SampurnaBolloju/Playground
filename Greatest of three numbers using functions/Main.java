import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner s= new Scanner(System.in);
      int n1=s.nextInt();
      int n2=s.nextInt();
      int n3=s.nextInt();
      int in_ter=big(n1,n2);
      int result=big(in_ter,n3);
      System.out.println(result);
    }
  public static int big(int n1,int n2)
  {
    if(n1>n2)
      return n1;
    else
      return n2;
  }
	    // Type your code here
	
}