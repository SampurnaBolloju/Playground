import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] str = new String[n];
        for(int i = 0; i < n; i++)
        {
            str[i] = in.next();
        }
        int k = 0;
        for(int i = 0; i < n; i++)  // you can also use tolowercase()
        {
            int ch=str[i].charAt(0);
            if(ch > 64 && ch < 91)
            {
                String s = str[i];
                char[] chr  = s.toCharArray();
                ch = ch + 32;
                chr[0] = (char)ch;
                str[i] = new String(chr);
            }
        }
        for(int i = 0; i < n  - 1; ++i) 
        {
            for (int j = i + 1; j < n; ++j) 
            {
                if (str[i].charAt(k) > str[j].charAt(k)) 
                {
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                    k = 0;
                }
            }
        }
        for(int i = 0; i < n; i++) 
        {
            System.out.println(str[i]);
        }

    //your code here;
  }
}