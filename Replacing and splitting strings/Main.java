import java.util.Scanner;

class Main
{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      String str1=in.nextLine();
      String str2=in.nextLine();
      int no_of_parts = in.nextInt();
      /*int count =0;
      int i =0;
      int l = str2.length();
      System.out.println(l);
      for(i = 0;i<l;i++)
      {
        if(str2[i]!=' ')
        {
          System.out.print(str2[i]);
        }
        else
          System.out.print("\n");
      }*/
      
        String[] arrOfStr = str2.split(" ", no_of_parts); 
  
        for (String a : arrOfStr) 
            System.out.println(a); 
      
      
      //Try your code here
    }
}