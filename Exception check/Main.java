import java.util.Scanner;
import java.util.InputMismatchException;
public class Main
{
   public static void main(String args[])
   {
     try
      {
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
	    System.out.println(num);
      }
      catch(InputMismatchException ie)
      {
	    System.out.println("Input Mismatch Exception occurred");
      }
      // type your code here
   }
}