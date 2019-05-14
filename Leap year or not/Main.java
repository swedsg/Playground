import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
      if((x%100!=0)&&(x%4==0)||x%400==0)
      {
      System.out.println("Leap year");
      }
      else 
        System.out.println("Non Leap year");
    }
}