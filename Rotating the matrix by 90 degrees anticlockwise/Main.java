import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int r = in.nextInt();
    int c = in.nextInt();
    int matrix[][] = new int[r][c];
    int i,j;
    for(i=0; i<r; i++)
    {
      for(j=0; j<c; j++)
      {
        matrix[i][j] = in.nextInt();
      }
    }
    for(j=c-1;j>=0;j--)
    {
      for(i=0; i<r; i++)
      {
        System.out.print(matrix[i][j]+" ");
      }
      System.out.print("\n");
    }
    // your code here
  }
}