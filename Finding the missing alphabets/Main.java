import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      StringBuilder sb = new StringBuilder(str);
      int str_len=sb.length();
      int ind;
      int fre[]= new int[30];
      for(ind=0;ind<30;ind++)
      {
        fre[ind]=0;
      }
      for(ind=0;ind<str_len;ind++)
      {
        if(sb.charAt(ind)>='A' && sb.charAt(ind)<='Z')
        {
          int offset = sb.charAt(ind)-'A';
          char ch=(char)('a'+offset);
          sb.setCharAt(ind,ch);
         }
        if(sb.charAt(ind)>='a' && sb.charAt(ind)<'z')
        {
          fre[sb.charAt(ind)-'a']++;
        }
      }
      for(ind=0;ind<26;ind++)
      {
        if(fre[ind]==0)
        {
          char ch = (char)(ind+'a');
          System.out.print(ch+" ");
        }
      }
              
      // Type your code here
    }
}