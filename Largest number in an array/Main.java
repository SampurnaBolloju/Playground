import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int arr[] = new int[size];
      int max= arr[0];
      for(int idx = 0; idx < size; idx++)
      {
        arr[idx] = in.nextInt();
        if(max<arr[idx])
        {
          max=arr[idx];
        }
      }
      System.out.println(max);
        // Type your code here
    }
}