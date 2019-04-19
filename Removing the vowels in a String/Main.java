import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    String str, r;
       Scanner in = new Scanner(System.in);
      
       str = in.nextLine();

       r = remVowels(str);
	   
       System.out.print(r);
   }

   public static String remVowels(String str)
   {
     String finalstr = "";
     int i;
     for(i=0; i<str.length(); i++)
     {
       if (!isVowel(Character.toLowerCase(str.charAt(i))))
       {
         finalstr = finalstr + str.charAt(i);
       }
     }
     return finalstr;
   }

   public static boolean isVowel(char c)
   {
     String vowels = "aeiou";
     int i;
     for(i=0; i<5; i++)
     {
       if(c == vowels.charAt(i))
       {
         return true;
       }
     }
     return false;//type your code here
  }
}