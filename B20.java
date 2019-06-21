import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    //str = s.nextLine();
    int n,m=1;
    n = s.nextInt();
    for(int i=1;i<=n;i++)
    {
      m = n * i;
      System.out.print(m);
      System.out.print(" ");
    }
   
 }
}
