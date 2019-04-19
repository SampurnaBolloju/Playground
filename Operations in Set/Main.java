import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      Set<String> list = new LinkedHashSet<String>(); 
      String input = br.readLine();
      String[] arr = input.split(",");
      for(int i =0; i<arr.length; i++)
      {
        list.add(arr[i]);
      }
      System.out.println(list);
      System.out.print("Enter the value to be deleted: ");
      String c = br.readLine();
      System.out.println(c);
      list.remove(c);
      System.out.println(list);
      System.out.print("Enter the value to be added: ");
      String b = br.readLine();
       System.out.println(b);
      list.add(b);
      System.out.println(list);
      
       // type your code here
    }
}