import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int result=sum(n);
      System.out.println(result);
    }
  public static int sum(int n)
  {
    int total=0;
    for(int i=1;i<=n;i++)
    {
      total=total+i;
    }
    return total;
  }
      
        
	    // Type your code here
	
}