import java.util.Scanner;
class Main{
  public static void prime(int d)
  {
    int flag=1;
 for(int i=2;i<=d;i++)
 {
 for(int j=2;j<=d/2;j++)
 {
 if(i%j==0 && i!=j)
 {
 flag=0;
   break;
 }
   else {
     flag=1;
   }
  }
  if(flag==1)
   {
   System.out.println(i);
   }
 }
  }
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      prime(n);
	}
}