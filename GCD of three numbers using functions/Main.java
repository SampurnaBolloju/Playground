import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
      Scanner s = new Scanner(System.in);
      int n1=s.nextInt();
      int n2=s.nextInt();
      int n3=s.nextInt();
      int in_ter=gcd(n1,n2);
      int result=gcd(in_ter,n3);
      System.out.println(result);
    }
  public static int gcd(int n1,int n2)
  {
    int min_term,result;
    if(n1>n2)
      min_term=n2;
    else
      min_term=n1;
    while(min_term>=0)
    {
      if((n1%min_term==0)&&(n2%min_term==0))
      {
        result=min_term;
        break;
      }
      min_term--;
    }
    return min_term;
  }
      
	    // Type your code here
	
}