import java.util.*;
import java.util.regex.*;
import java.io.*;
public class Main {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String word = sc.nextLine();
      String line = sc.nextLine();
      Pattern ptn = Pattern.compile(word);
      Matcher mat = ptn.matcher(line);
      int count = 0;
      while(mat.find())
      {
        count++;
        System.out.println("found: "+count+" : "+mat.start()+" - "+mat.end());
      }
      if(count!=0)
        System.out.println(count);
      else
        System.out.println("The given word is not present in the string");
      
       // type your code here
    }
}