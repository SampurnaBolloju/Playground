import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
     Scanner in = new Scanner(System.in);
    int r = in.nextInt();
    int c = in.nextInt();
    int arr_1[][]= new int [r][c];
    int arr_2[][] = new int[r][c];
    int arr_3[][] = new int[r][c];
    int i,j;
    for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++)
      {
        arr_1[i][j] = in.nextInt();
       
      }
    }
     for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++)
      {
        arr_2[i][j] = in.nextInt();
       
      }
    }
    
    for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++)
      {
          arr_3[i][j] = arr_1[i][j]-arr_2[i][j];
 
      }
    }
    for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++)
      {
        System.out.print(arr_3[i][j]+" ");
      }
      System.out.print("\n");
    }
    
    // Type your code here
  }
}