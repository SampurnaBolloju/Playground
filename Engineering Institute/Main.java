import java.util.Scanner;
//import required packages

class Faculty
{
  public void salary(int base)
  {
    System.out.println("Base Salary: "+base);
    //write your Faculty class statements
  }
}
class CSE
{
  public void salary(int base)
  {
    System.out.println("CSE Faculty: "+(base+3000));
    //write your CSE class statements
  }
}
class IT
{
  public void salary(int base)
  {
    System.out.println("IT Faculty: "+(base+5000));
    //write your IT class statements
  }
}
class ECE
{
  public void salary(int base)
  {
    System.out.println("ECE Faculty: "+(base+4500));
    //write your ECE class statements
  }
}

class Main
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    int base = s.nextInt();
    Faculty f = new Faculty();
    f.salary(base);
    CSE obj1 = new CSE();
    obj1.salary(base);
    IT obj2 = new IT();
    obj2.salary(base);
    ECE obj3 = new ECE();
    obj3.salary(base);
    //implement your required concept here
  }
}