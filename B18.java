import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    //str = s.nextLine();
    int n,k,q,r,sum=0,g,i;
    n = s.nextInt();
    g = s.nextInt();
    
   for(i=n;i<g;i++)
   {
     k=i;
      while(k>0)
    {
      
      r=k%10;
      sum = sum + (r*r*r);
      k=k/10;
    }
    
    if(i == sum)
    {
      System.out.println(i);
    }
    sum=0;
   }
   
 }
}
