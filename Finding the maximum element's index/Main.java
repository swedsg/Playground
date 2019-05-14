import java.util.Scanner;
class Main
{
  public static int find(int b[])
  {
  int max=b[0];
    for(int j=0;j<b.length;j++)
    {
    if(max<b[j])
    {
    max=b[j];
    }
    }
    return max;
  }
  public static int search(int x,int a[])
  {
    int p=0;
  for(int t=0;t<a.length;t++)
  {
  if(x==a[t])
  {
    p=t;
    break;
  }
  }
    return p;
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    
    for(int i=0;i<n;i++)
    {
    arr[i]=sc.nextInt();
    }
    int m=find(arr);
    int r=search(m,arr);
    System.out.println(r);
  }
}