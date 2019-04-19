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
    int cnt[] = new int[arr_size];
    int count =1;
    for(i=0; i<arr_size; i++)
    {
      for(int j=i+1; j<arr_size; j++)
      {
        if(arr[i]==arr[j])
        {
          count++;
        }
      }
      cnt[i] = count;
      count=1;
    }
    int temp = 0;
    int ele=cnt[0];
    for(i=0; i<arr_size; i++)
      {
         if(ele<cnt[i])
         {
           temp=i;
         }
    }
    System.out.println(arr[temp]);
      
      
    // your code here
  }
}