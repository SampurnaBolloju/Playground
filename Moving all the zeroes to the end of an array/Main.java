import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr[] = new int[n];
      int arr_1[] = new int[n];
      int i;
      int j=0;
      for(i =0;i<n;i++)
      {
        arr[i]=in.nextInt();
        if(arr[i]>0)
        {
          arr_1[j]=arr[i];
          j++;
        }
      }
      for(i=0;i<n;i++)
      {
        if(i<j)
        {
          System.out.print(arr_1[i]+" ");
        }
        else
          System.out.print("0"+" ");
      }
       // Type your code here
    }
}