import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      while(n/10>9)
      {
        n=n/10;
      }
      
      n=n%10;
      
      System.out.println(n);
	    // Type your code here
	}
}