import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      for(int i=1;i<=n;i++)
      {
        for(int j=n+1-i;j>0;j--)
        {
          System.out.print(j);
        }
        System.out.print("\n");
      }
	    // Type your code here
	}
}