import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      int arr_index=0;
      for(arr_index=0;arr_index<arr_size;arr_index++)
      {
        arr[arr_index]=in.nextInt();
      }
      int value = in.nextInt();
      search_sum(arr,arr_size,value);
    }
   public static void search_sum(int arr[],int arr_size,int value)
   {
     int arr_index=0,arr_index1=0;
     for(arr_index=0;arr_index<arr_size;arr_index++)
     {
       for(arr_index1=arr_index+1;arr_index1<arr_size;arr_index1++)
       {
         if(arr[arr_index]+arr[arr_index1]==value)
         {
           System.out.println(arr[arr_index]+","+" "+arr[arr_index1]);
         }
       }
     }
   }
   
      
      
      // Type your code here
    
}