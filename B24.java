import java.util.Scanner;
import java.lang.Math;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int a[] = new int[n];
    int t;
    for(int i=0;i<n;i++)
    {
      a[i] = s.nextInt();
    }
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n-1;j++)
      {
        if(a[i] > a[j])
        {
          t = a[i];
          a[i] = a[j];
          a[j] = t;

        }
      }
      
    }
    for(int i=0;i<n;i++)
    {
      System.out.println(a[i]);
    }
    
    
  }
}
