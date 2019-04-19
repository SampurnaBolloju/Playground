import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      int select= in.nextInt();
      double one = in.nextInt();
      
      switch(select)
      {
        case 1: 
          System.out.println(one*one);
          		break;
        case 2:  double two = in.nextInt();
          System.out.println(one*two);
          		break;
        case 3: double three = in.nextInt();
          System.out.println((one*three)/2);
          		break;
        case 4: System.out.println(3.14*one*one);
          		break;
        default: System.out.println("entered wrong choice");
                 break;
      }
    
      
        
        //Try your code here
    }
}