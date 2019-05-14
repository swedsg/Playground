import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    String str1=sc.nextLine();
    String str2=sc.nextLine();
    StringBuilder sb=new StringBuilder(str1);
    StringBuilder sb1=new StringBuilder(str2);
     int l=str1.length();
     int b=str2.length();
     int c=0;
    for(int i=0;i<(l-b+1);i++)
    {
      boolean x=true;
    for(int j=0;j<b;j++)
    {
    if(sb.charAt(i+j)!=sb1.charAt(j))
      x=false;
    }
      if(x==true)
      {
      c++;
      }
    }
    System.out.println(c);
  } 
}