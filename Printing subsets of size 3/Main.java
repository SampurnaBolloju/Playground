import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      int arr_index;
      for(arr_index=0;arr_index<arr_size;arr_index++)
      {
        arr[arr_index]=in.nextInt();
      }
      subset_display(arr_size,arr);
    }
  public static void subset_display(int arr_size,int arr[])
  {
    int arr_ind_1,arr_ind_2,arr_ind_3;
    for(arr_ind_1=0;arr_ind_1<arr_size;arr_ind_1++)
    {
      for(arr_ind_2=arr_ind_1+1;arr_ind_2<arr_size;arr_ind_2++)
      {
        for(arr_ind_3=arr_ind_2+1;arr_ind_3<arr_size;arr_ind_3++)
        {
          System.out.print("("+arr[arr_ind_1]+","+" "+arr[arr_ind_2]+","+" "+arr[arr_ind_3]+")"+" ");
        }
      }
      if(arr_ind_1!=arr_size-1)
      {
         System.out.print("\n");
      }
    }
  }
      
  
       // Type your code here
    
}