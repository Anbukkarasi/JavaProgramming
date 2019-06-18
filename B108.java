import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    //str = s.nextLine();
    int n,k;
    n = s.nextInt();
    k = s.nextInt();
     
    int a[] = new int[n];
    for(int i=0;i<n;i++)
    {
      a[i] = s.nextInt();
    }
    for(int i=0;i<n;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        if(a[i] < a[j])
      {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
      }
      }
          
    }
    
  System.out.print(a[k]);
  }
}
