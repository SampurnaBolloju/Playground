import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i] = in.nextInt();
    }
    ascend(arr,n);
    descend(arr,n);
    for(int i=0;i<n;i++)
    {
      System.out.print(arr[i]+" ");
    }
  }
  public static void ascend(int arr[], int n)
  {
    int i,j;
    for(i=0;i<=n/2-2;i++)
    {
      for(j=0;j<=n/2-2-i;j++)
      {
        if(arr[j]>arr[j+1])
                      {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                      }
                      }
                      }
                      }
     public static void descend(int arr[] , int n)
                      {
                        int i,j;
                        for(i=n/2;i<=n-2;i++)
                        {
              
                          for(j=n/2;j<=n-2;j++)
                          {
                            
                            if(arr[j]<arr[j+1])
                            {
                             
                              int temp = arr[j];
                              arr[j] = arr[j+1];
                              arr[j+1] = temp;
                            }
                          }
                        }
                      
                    
    // your code here
  }
}