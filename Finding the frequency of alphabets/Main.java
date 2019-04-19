import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      StringBuilder sb = new StringBuilder(str);
      int str_len= sb.length();
      int fre[] = new int[70];
      int ind;
      for(ind=0;ind<70;ind++)
      {
        fre[ind]=0;
      }
      for(ind=0;ind<str_len;ind++)
      {
        if(sb.charAt(ind)>='A' && sb.charAt(ind)<='Z')
        {
          int offset = sb.charAt(ind)-'A';
          char ch =(char)('a'+offset);
            sb.setCharAt(ind,ch);
        }
        if(sb.charAt(ind)>='a' && sb.charAt(ind)<='z')
        {
          fre[sb.charAt(ind)-'a']++;
        }
      }
      for(ind=0;ind<str_len;ind++)
      {
        if(fre[sb.charAt(ind)-'a']!=0)
        {
           System.out.print(sb.charAt(ind) +"" +fre[sb.charAt(ind)-'a'] + " ");
            fre[sb.charAt(ind)-'a']=0;
        }
      }
              
     
        // Type your code here
    }
}