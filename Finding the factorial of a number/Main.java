import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int result = factorial(n);
    System.out.println(result);
  }
  public static int factorial(int n)
  {
    if(n==0 || n==1)
      return 1;
    else
      return n*factorial(n-1);
  }
}