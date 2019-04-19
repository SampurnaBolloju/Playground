import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      ArrayList<String> list = new ArrayList<String>();
       int flag =1;
      while(flag!=0)
      {
        System.out.println("Choose any one:");
        System.out.println("1.Insert");
        System.out.println("2.delete");
        System.out.println("3.Display");
        System.out.println("4.Exit");
        int ch = Integer.parseInt(br.readLine());
        switch(ch)
        {
          case 1: String input = br.readLine();
            	  String[] arr = input.split(",");
            	  for(int i=0; i<arr.length; i++)
                  {
                    list.add(arr[i]);
                  }
            	  break;
          case 2 : System.out.print("Enter the index value to be deleted:");
            	   int n = Integer.parseInt(br.readLine());
            	   System.out.println(n);
            	   list.remove(n);
            		break;
          case 3 : System.out.println(list);
            	   break;
          case 4 : flag=0;
            	   break;
        }
    
      }
    }
      //type your code here
    
}