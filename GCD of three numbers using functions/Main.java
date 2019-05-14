import java.util.Scanner;
public class Main{
  public static int gcd(int x,int y)
  {
    int g=x;
    int min;
  if(x>y)
  {
  min=x;
  }
    else
    {
    min=y;
    }
    while(min>=1)
    {
    if(x%min==0&&y%min==0)
    {
    g=min;
      break;
    }
      min--;
    }
    return g;
  }
	public static void main (String[] args)
	{
	    Scanner sc=new Scanner(System.in);
      int p=sc.nextInt();
      int q=sc.nextInt();
      int r=sc.nextInt();
      int k=gcd(p,q);
      int t=gcd(k,r);
      System.out.println(t);
	}
}