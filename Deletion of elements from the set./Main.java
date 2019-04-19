import java.io.*;
import java.lang.*;
import java.util.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      TreeSet<String> list = new TreeSet<String>();
      String input = br.readLine();
      String[] arr = input.split(",");
      for(int i=0; i<arr.length; i++)
      {
        list.add(arr[i]);
      }
      System.out.println(list);
      Object arr1[] = list.toArray();
      int n = arr1.length-1;
      while(list.isEmpty()!=true)
      {
        Object k = arr1[n];
        list.remove(k);
        System.out.println(list);
        --n;
      }
     // type your code here
    }
}