import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
     
      for(int i=0;i<n;i++)
      {
      arr[i]=sc.nextInt();
      }
       int v=sc.nextInt();
      for(int j=0;j<n;j++)
      {
        for (int k=j+1;k<n;k++)
        {
      if(v==(arr[j]+arr[k]))
      {
      System.out.println(arr[j]+","+" "+arr[k]);
      }
        }
      }
    }
}