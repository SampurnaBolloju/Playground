import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    int i;
    for(i=0;i<n;i++)
    {
      arr[i] = in.nextInt();
    }
       sub_array_sum(arr,n);
  }
  public static void sub_array_sum(int arr[], int n)
  {
    int i,j;
    for(i=0;i<n;i++)
    {
      int temp = arr[i];
      for(j=i+1;j<n;j++)
      {
        if(arr[j]>temp)
        {
          System.out.println(arr[i]+","+arr[j]);
        }
      }
    }
    
    
    //your code here;
  }
}