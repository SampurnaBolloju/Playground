import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int r = in.nextInt();
    int c = in.nextInt();
    int m_1[][] = new int[r][c];
    int m_2[][] = new int[r][c];
    int i,j;
    int flag = 0;
    for(i=0; i<r; i++)
    {
      for(j=0; j<c; j++)
      {
        m_1[i][j] = in.nextInt();
      }
    }
    for(i=0; i<r; i++)
    {
      for(j=0; j<c; j++)
      {
        m_2[i][j] = in.nextInt();
      }
    }
    for(i=0; i<r; i++)
    {
      for(j=0; j<c; j++)
      {
        if(m_1[i][j] != m_2[i][j])
        {
          flag = 1;
        }
      }
    }
      if(flag == 0)
        System.out.println("Yes");
    else
        System.out.println("No");
      
    //your code here
  }
}