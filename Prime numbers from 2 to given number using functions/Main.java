import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      prime(n);
    }
  public static void prime(int n)
  {
    for(int i=2;i<=n;i++)
    {
      int count=0;
      for(int j=1;j<=i;j++)
      {
        if(i%j==0)
          count++;
      }
      if(count==2)
        System.out.println(i);
    }
	    // Type your code here
  }
}