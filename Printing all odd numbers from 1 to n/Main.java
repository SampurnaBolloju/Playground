import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner s = new Scanner(System.in);
      int n= s.nextInt();
      int count;
      for(count=1;count<=n;count++)
      {
        if(count%2==1)
        System.out.println(count);
      }
      
	     // Type your code here
	}
}