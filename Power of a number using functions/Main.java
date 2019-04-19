import java.util.Scanner;
class Main{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int base=in.nextInt();
    int exponent=in.nextInt();
    int result=power(base,exponent);
    System.out.println(result);
  }
  public static int power(int base,int exponent)
  {
    int mul=1;
    for(int i=1;i<=exponent;i++)
    {
      mul=mul*base;
    }
    return mul;
  }
}
      
    