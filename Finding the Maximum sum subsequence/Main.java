import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int arr_size = in.nextInt();
    int arr[] = new int[arr_size];
    int i;
    for(i=0; i<arr_size; i++)
    {
      arr[i] = in.nextInt();
    }
    int temp_sum=arr[0], max_sum=arr[0];
    for(i=1; i<arr_size; i++)
    {
      if(arr[i]>arr[i-1])
      {
        temp_sum+=arr[i];
      }
      else
      {
        temp_sum = arr[i];
      }
      if(temp_sum>max_sum)
      {
        max_sum=temp_sum;
        
      }
    }
    System.out.println(max_sum);
        
    // your code here
  }
}