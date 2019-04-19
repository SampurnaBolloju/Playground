import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      Set<String> values = new LinkedHashSet<String>();
      String input = br.readLine();
      String[] arr = input.split(",");
      for(int i = 0; i<arr.length; i++)
      {
        values.add(arr[i]);
      }
      System.out.println(values);
      //type your code here
    }
}