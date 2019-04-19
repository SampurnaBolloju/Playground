import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner s = new Scanner(System.in);
      int n=s.nextInt();
      for(int count=1;count<=2*n-1;count++)
      {
        if(count%2==1)
          System.out.println(count);
      }
	     // Type your code here
	}
}