import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    long  n = s.nextLong();
    int q,r,i,k,j=0;
    int c = 0;
    int d = 0;
    long a[] = new long[100];
    for(i = 1;i<n;i++)
    {
      k = i;
      c = i;
      while(k != 0)
      {
        r = k % 10;
        k = k / 10;
        c = c + r;
        
      }
      //System.out.println(c);
      if(c == n)
      {
        d++;
        a[j] = i;
        j++;
      }
    }
    for(i = 0;i<j;i++)
    {
        System.out.println(d);
        System.out.println(a[i]);
    }
    
  }
}
