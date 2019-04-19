import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        TreeSet<String> list = new TreeSet<String>();
        String input = br.readLine();
        String[] arr = input.split(",");
        System.out.println("Duplicate Entry is: "); 
        for (String str : arr) {
            if (!list.add(str)) {
                System.out.println(str);
            }
        }
        System.out.println("TreeSet is : " + list);
     // type your code here
    }
}