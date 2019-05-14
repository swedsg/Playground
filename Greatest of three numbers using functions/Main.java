import java.util.Scanner;
class Main{
  public static int greate(int x,int y,int z)
  {
    int g=x;
  if(x>y&&x>z)
  {
  g= x;
   
  }
    else if(y>x&&y>z)
    {
       g= y;
       
    }
    else {
      g= z;
    
    }
    return g;
  }
	public static void main (String[] args)
    {
	   Scanner sc=new Scanner(System.in);
      int p=sc.nextInt();
int q=sc.nextInt();
      int r=sc.nextInt();
      int k=greate(p,q,r);
      System.out.println(k);
    }
}