import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner sc=new Scanner(System.in);  
      int n=sc.nextInt();
      int last=n%10;
      int d=0;
      while(n>10)
      {
      n=n/10;
      }
     int sum=last+n;
      System.out.println(sum);
    }

}