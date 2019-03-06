import java.util.*;
class Main {
  public static void main(String[] args) {
    System.out.println("Enter N");
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int count = 0;
    int t;
    boolean flag = false;
    int a[] = new int[n];
    int newArr[] = new int[n];
    for(int i=0;i<n;i++)
    {
      a[i] = s.nextInt();
    }
    for(int i=0;i<n-1;i++)
    {
     for(int j=i+1;j<n;j++)
    {
      
      if(a[i] < a[j])
      {
        t = a[i];
        a[i] = a[j];
        a[j] = t;
      }

    }
    }
    
    for(int b=0;b<n;b++)
    {
       System.out.print(a[b]);
    }
  }
}



