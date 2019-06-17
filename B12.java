
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int n,q,k,r,rev=0;
    
    int j=1;
    Scanner s = new Scanner(System.in);
    k = s.nextInt();
    //k = s.nextInt();
    
    n = k;
    while(n!=0)

    {
      r=n%10;
      rev = rev*10 + r;
      n=n/10;

    }
     
    if(rev == k)
    {
      System.out.print("yes");
    }
    else{
      System.out.print("no");
    }
    
    
   
  }
}
