import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      int s=1;
       Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
      int y=sc.nextInt();
      while(y>0)
      {
       s=s*x;
        y--;
      }
      System.out.println(s);
    }
}