import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
        int arr_size = in.nextInt();
        int arr[] = new int[arr_size];
      int ind;
        for(ind = 0; ind<arr_size;ind++){
            arr[ind] = in.nextInt();
        }
        int k = in.nextInt();
        // Sorting the given array and printing the kth largest number
        selection(arr_size, arr);
        System.out.println(arr[arr_size-k]);
    }
    public static void selection(int arr_size, int arr[])
    {
        for(int start = 0; start<arr_size-1; start++)
        {
            int min = find_min(start, arr, arr_size-1);
            swap(start, min, arr);
        }
    }
     public static void swap(int start, int min, int arr[]){
         int temp = arr[start];
         arr[start] = arr[min];
         arr[min] = temp;
     }
     public static int find_min(int start, int arr[], int end){
         int min= 0;
         if(arr[start] < arr[start+ 1])
         {
             min = start;
         }
         else{
             min = start+ 1;
         }
         for(int i = start + 2; i <= end; i++){
             if(arr[min] > arr[i])
             {
                 min = i;
             }
         }
         return min;
      // Type your code here
    }   
}