import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner (System.in);
      int x=sc.nextInt();
      if(x>=85)
      {
      System.out.println("A");
      }
       if(x>=75&&x<=85)
      {
      System.out.println("B");
      }
       if(x>=65&&x<=75)
      {
      System.out.println("C");
      }
      if(x>=55&&x<=65)
      {
      System.out.println("D");
      }
       if(x>=45&&x<=55)
      {
      System.out.println("E");
      }
      if(x<45)
      {
      System.out.println("Fail"); 
      }
    }
}