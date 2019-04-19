
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
public class Main{
  public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  String line = sc.nextLine();
 Pattern pat = Pattern.compile("(,| |and|or)");
  String[] str= pat.split(line);
  for(String p:str)
  {
    System.out.println(p);
  }       // type your code here
    }
}