import java.util.Scanner;
import java.lang.Math;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int a[] = new int[n];
    for(int i=0;i<n;i++)
    {
      a[i] = s.nextInt();
    }
    int v = n/2 - 1;
    if(n%2==0)
    {
      double k =Math.ceil(( a[v] + a[v+1])/2);
      System.out.println(k);
    }
    else{
      v = n/2;
      System.out.println(a[v]);
    }
   
    
  }
}
