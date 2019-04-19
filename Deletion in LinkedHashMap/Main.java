import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      Map<String, String> list = new LinkedHashMap<String, String>();
      System.out.print("Enter the number of values to be inserted in map:");
      int n = Integer.parseInt(br.readLine());
      String key;
      String value;
      System.out.println(n);
      while(n>0)
      {
        key =br.readLine();
         value = br.readLine();
        list.put(key,value);
        n--;
      }
      System.out.println(list);
      System.out.print("Enter the index to be removed:");
      String index = br.readLine();
      System.out.println(index);
      list.remove(index);
      System.out.println(list);
      System.out.println("Size of map is : "+list.size());
        // type your code here
    }
}