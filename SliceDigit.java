import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = s.nextInt();
    System.out.println("Enter the digits");
    int d = s.nextInt();
    int q,r=0,count=0;
    int b = n,m;
    while(b!=0)
    {
      q=b/10;
      count++;
      b=q;
    }
    
    int[] arr = new int[count];
    m=count;
    while(n!=0)
    {
      q=n/10;
      r = n%10;
      arr[m-1] = r;
      m--;
      n=q;
    }
    arr[m] = r;
   
    for(int j=d;j<arr.length;j++)
    {
      System.out.print(arr[j]);
    }
  }
}
