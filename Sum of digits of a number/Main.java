import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner sc=new Scanner(System.in);  
      int n=sc.nextInt();
      int sum=n%10;
      while(n>0)
      {
      n=n/10;
        int t=n%10;
        sum=sum+t;
      }
     //int sum=last+n;
      System.out.println(sum);
    }
}