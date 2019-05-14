import java.util.Scanner;
class Main
{
  public static int power(int m,int n)
  {
    int sum=1;
   for(int i=1;i<=n;i++)
   {
   sum=sum*m;
   }
    return sum;
  }
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int m=sc.nextInt();
 int n=sc.nextInt();
 int x=power(m,n);
  System.out.println(x);
}
}