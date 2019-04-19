import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int r = in.nextInt();
    int c = in.nextInt();
    int arr[][]= new int [r][c];
    int i,j;
    for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++)
      {
        arr[i][j] = in.nextInt();
      }
    }
    int tran[][] = new int[c][r];
    for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++)
      {
        tran[j][i] = arr[i][j];
      }
    }
    for(i=0;i<c;i++)
    {
      for(j=0;j<r;j++)
      {
        System.out.print(tran[i][j]+" ");
      }
      System.out.print("\n");
    }
    
    // Type your code here
  }
}