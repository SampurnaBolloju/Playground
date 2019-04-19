import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    int i,j;
    for(i=0;i<n;i++)
    {
      arr[i] = in.nextInt();
    }
    for(i=0;i<= n/2-2;i++)
    {
      for(j=0;j<= n/2-2-i;j++)
          {
            if(arr[j]>arr[j+1])
            {
              int temp = arr[j];
              arr[j] = arr[j+1];
              arr[j+1] = temp;
            }
          }
    }
          for(i=0;i<n;i++)
          {
            System.out.print(arr[i]+" ");
          }
              
                             
    //type your code;
  }
}