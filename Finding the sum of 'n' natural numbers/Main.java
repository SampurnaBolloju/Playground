import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int result = natural_add(n);
      System.out.println(result);
    }
  public static int natural_add(int n)
  {
    if(n==0)
      return 0;
    else if(n==1)
      return 1;
    else
      return n+natural_add(n-1);
  }
		// Type your code here
    }
