import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	  Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
      if(x>=1&&x<=5)
      {
      if(x==1)
      {
      System.out.println("One");
      }
      if(x==2)
      {
      System.out.println("Two");
      }
       if(x==3)
      {
      System.out.println("Three");
      }
        if(x==4)
      {
      System.out.println("Four");
      }
        if(x==5)
      {
      System.out.println("Five");
      }
      }
      else
       System.out.println("Invalid");  
	}
}