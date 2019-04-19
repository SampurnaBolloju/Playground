import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      int str_len=str.length();
      int str_index;
      int front=0;
      int end=str_len-1;
      boolean is_matching=true;
      while(front<end)
      {
        if(str.charAt(front)!=str.charAt(end))
           {
             is_matching =false;
            break;
           }
             front++;
             end--;
           }
      if(is_matching==true)
      {
        System.out.println("Yes");
      }
      else if (is_matching==false)
      {
         System.out.println("No");
      }
    }
}
