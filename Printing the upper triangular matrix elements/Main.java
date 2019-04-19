import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int r = in.nextInt();
    int c = in.nextInt();
    int mat[][] = new int[r][c];
    int i,j,k;
    for(i=0; i<r; i++)
    {
      for(j=0; j<c; j++)
      {
        mat[i][j] = in.nextInt();
      }
    }
    for(k=0; k<c; k++)
    {
      for(i=0, j=k; j<c; i++,j++)
      {
        System.out.print(mat[i][j]+" ");
      }
    }
    
    // your code here
  }
}