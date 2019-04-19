import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      int ind;
      boolean is_palindrome = true;
      for(ind=0;ind<arr_size;ind++)
      {
        arr[ind]=in.nextInt();
      }
      int front=0;
      int end=arr_size-1;
      while(front<end)
      {
        if(arr[front]!=arr[end])
        {
          is_palindrome = false;
          break;
        }
        front++;
        end--;
      }
     if(is_palindrome==true)
     System.out.println("Yes");
      else
         System.out.println("No");
     
          
        // Type your code here
    }
}