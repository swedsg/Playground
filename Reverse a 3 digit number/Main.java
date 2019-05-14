import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    int rev=0;
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    while(x!=0){
     rev=rev*10;

    rev=rev+x%10;
      x=x/10;
    }
    System.out.println(rev);
  }
}