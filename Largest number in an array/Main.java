import java.util.Scanner;
class Main{
  public static int max(int num[])
  {
    int max=num[0];
  for(int j=0;j<num.length;j++)
  {
  if(max<num[j])
  {
  max=num[j];
  }
  }
    return max;
  }
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
      arr[i]=sc.nextInt();
      }
      int t=max(arr);
      System.out.println(t);
    }
}