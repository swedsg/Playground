import java.util.Scanner;
class Main {
	public static void main (String[] args)
    {
      Scanner sc=new Scanner(System.in);  
      int n=sc.nextInt();
      //int last=n%10;
      while(n>100)
      {
      n=n/10;
      }
      int sec=n%10;
     //int sum=last+n;
      System.out.println(sec);
    }
}