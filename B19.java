import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    //str = s.nextLine();
    int n,fact=1;
    n = s.nextInt();
    for(int i=1;i<=n;i++)
    {
      fact = fact * i;
    }
   System.out.print(fact);
 }
}
