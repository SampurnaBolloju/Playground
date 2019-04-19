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
    strict_sub(arr,n);
  }
  public static void strict_sub(int arr[], int n)
  {
    int i,j,k;
    for(i=0;i<n;i++)
    {
      int temp = arr[i];
      int flag=1;
      for(j=i+1;j<n;j++)
      {
        if(arr[j]>temp)
        {
          for(k=i;k<=j;k++)
          {
            if(arr[k]>arr[j])
            {
              flag=0;
            }
          }
          if(flag==1)
           System.out.println(arr[i]+","+arr[j]);
         
        }
         flag=1;
        }
    }
    //your code here;
  }
}