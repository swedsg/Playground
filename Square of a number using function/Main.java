import java.util.Scanner;
class Main
{
  public static   int squre(int n)
  {
  int s=n*n;
    return s;
  }
	public static void main (String[] args)
    {
       Scanner sc=new Scanner(System.in);
      int  y=sc.nextInt();
	 int x= squre(y);
      System.out.println(x);
	} 
}