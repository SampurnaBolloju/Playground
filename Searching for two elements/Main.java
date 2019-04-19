import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();;
      int arr[] =new int[arr_size];
      for(int i = 0;i<arr_size;i++)
      {
        arr[i]=in.nextInt();
      }
      int s_ele_1 = in.nextInt();
      int s_ele_2 = in.nextInt();
      int flag_1=0,flag_2=0;
      int a=0;
      int b=0;
      for(int i =0;i<arr_size;i++)
      {
        
        if(arr[i]==s_ele_1)
        {
           a=i;
           flag_1=1;
        }
         if (arr[i]==s_ele_2)
        {
          b=i;
          flag_2=1;
         }
      }
      if(flag_1==1)
        System.out.println(a);
        else
        System.out.println("-1");
      if(flag_2==1)
        System.out.println(b);
        else
        System.out.println("-1");
      
   
        // Type your code here
    }
}