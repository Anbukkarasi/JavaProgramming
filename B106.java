import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int k,sum=1,n,c=0;
    String str;
     
    Scanner s = new Scanner(System.in);
    //str = s.nextLine();
    n = s.nextInt();
    k = s.nextInt();
    int a[] = new int[n];
    for(int i=0;i<n;i++)
    {
      int d = s.nextInt();
      if(d%2!=0)
      {
        a[c] = d;
        c=c+1;
      }
    }
    System.out.print(a[k-1]);
  }
}
