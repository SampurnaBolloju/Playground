import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
      int n =in.nextInt();
      char s='#';
		for(int i=1;i<=n;i++)
        {
          for(int j=1;j<=i;j++)
          {
            if(s=='#')
            {
           System.out.print("*");
            s='*';
            }
            else if(s=='*'){
              System.out.print("#");
              s='#';
            }
          
          }
          System.out.print("\n");
        }
} 
}
	
          
          
  		// Type your code here
    
