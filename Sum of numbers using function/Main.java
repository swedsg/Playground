import java.util.Scanner;
class Main{
   public static int suma(int n)
       {
         int sum=0;
       for(int i=1;i<=n;i++)
       {
       sum=sum+i;
       }
       return sum;  
       }
	public static void main (String[] args){
	  Scanner sc=new Scanner(System.in);
      int d=sc.nextInt();
      int x=suma(d);
      System.out.println(x);
	}
}