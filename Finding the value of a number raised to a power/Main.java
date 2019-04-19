import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      int base = in.nextInt();
      int exponent = in.nextInt();
      int mul =1;
      for(int i =1; i<=exponent; i++)
      {
        mul = mul*base;
      }
      System.out.println(mul);
        //Try your logic here
    }
}