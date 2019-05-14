import java.util.Scanner;
class Main{
    public static void main(String args[]) 
    {
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      StringBuilder sb=new StringBuilder(str);
      int l=str.length();
      int f=0;
      int e=l-1;
      while(f<e)
      {
         boolean x=true;
        if(sb.charAt(f)!=sb.charAt(e))
        {
        x=false;
        }
        f++;
        e--;
      
      if(x==true)
      {
      System.out.println("Yes");
        break;
      }
      else
      {
      System.out.println("No");
        break;
      }
      }
    } 
}