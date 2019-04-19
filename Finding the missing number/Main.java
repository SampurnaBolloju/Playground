import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      int ind;
      for(ind=0;ind<arr_size;ind++)
      {
        arr[ind]=in.nextInt();
      }
      ind=arr_size;
      while(ind>0)
      {
        int cnt=0;
        for(int i=0;i<arr_size;i++)
        {
          if(ind==arr[i])
          {
            cnt++;
          }
        }
        if(cnt==0)
        {
          System.out.println(ind);
        }
        ind--;
      }
      
        // Type your code here
    }
}