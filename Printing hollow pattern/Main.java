import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(int i=1;i<=n;i++)
      {
        if(i==1||i==n)
           {
             for(int j=1;j<=n;j++)
             {
                System.out.print("*");
             }
           }
           else
           {
             for(int j=1;j<=n;j++)
             {
               if(j==1||j==n)
                System.out.print("*");
               else
                  System.out.print(" ");
             }
           }
            System.out.print("\n");
           }
             
	    // Type your code here
	}
}