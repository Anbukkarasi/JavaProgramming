
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int n,q,k,r,rev=0;
    
    int j=1;
    boolean flag = false;
    Scanner s = new Scanner(System.in);
    k = s.nextInt();
    //k = s.nextInt();
    
   for(int i=2;i<=k/2;i++)
   {
     if(k%i==0)
     {
        System.out.print("no");
        flag = true;
        break;
     }
   }
   if(!flag)
   {
      System.out.print("yes");
   }
    
    
   
  }
}
