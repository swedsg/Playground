import java.util.Scanner;
class Main{
  public static int search(int x,int num[])
  {
  int p=num.length;
    for(int j=0;j<p;j++)
    {
    if(x==num[j])
    {
    p=j;
      break;
    }
    }
    if(p==num.length)
    {
    p=-1;
    }
    return p;
  }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
      arr[i]=sc.nextInt();
      }
      int f=sc.nextInt();
      int s=sc.nextInt();
      int t=search(f,arr);
      int b=search(s,arr);
      System.out.println(t);
      System.out.println(b);
    }
}