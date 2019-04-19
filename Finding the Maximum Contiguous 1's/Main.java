import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      int one[] = new int[arr_size];
      int i,idx=0;
      for(i=0; i<arr_size; i++)
      {
        arr[i] = in.nextInt();
      }
      int count=0,temp;
      for(i=0; i<arr_size; i++)
      {
        if(arr[i]==1)
        {
          count++;
        }
        else
        {
         one[idx] = count;
          count=0;
          idx++;
        }
      }
      temp =one[0];
      for(i=0; i<idx; i++)
      {
        if(temp<one[i])
        {
          temp=one[i];
        }
      }
      
      System.out.println(temp);
          
          
    	// type your code here
    }
}