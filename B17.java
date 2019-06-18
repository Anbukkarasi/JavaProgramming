import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    //str = s.nextLine();
    int n,k,q,r,sum=0;
    n = s.nextInt();
    //k = s.nextInt();
   k=n;
    while(n!=0)
    {
      q=n/10;
      r=n%10;
      sum = sum + (r*r*r);
      n=q;
    }
    if(k==sum)
    {
      System.out.print("yes");
    }
    else{
      System.out.print("no");
    }
 }
}
