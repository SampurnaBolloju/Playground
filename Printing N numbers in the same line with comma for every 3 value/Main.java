import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    for(int i=1;i<=n;i++)
    {
      System.out.print(i);
      if((i%3==0)&&(i!=n))
        System.out.print(",");
    }
   //Type your code here
  }
}