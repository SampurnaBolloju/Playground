import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int temp=n;
      int count=0,rem;
      int mul=1;
      int sum=0;
      while(n>0)
      {
        rem=n%10;
        n=n/10;
        count++;
      }
      n=temp;
      while(n>0)
      {
        rem=n%10;
        n=n/10;
        mul=1;
        for(int i=1;i<=count;i++)
        {
          mul=mul*rem;
        }
        sum=sum+mul;
      }
      if(sum==temp)
      
        System.out.println("Armstrong Number");
        else
      
          System.out.println("Not a Armstrong Number");
	   // Type your code here
	}
}