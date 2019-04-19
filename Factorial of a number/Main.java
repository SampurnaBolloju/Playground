import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner s = new Scanner(System.in);
      int n =s.nextInt();
      int mul=1;
     
      for(int i=1;i<=n;i++)
      {
        mul=mul*i;
      }
      System.out.println(mul);
        // Type your code here
	}
}