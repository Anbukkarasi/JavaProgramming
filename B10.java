import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int n,q;
    
    int j=0;
    Scanner s = new Scanner(System.in);
    n = s.nextInt();
    
    while(n!=0)

    {
      q = n/10;
      j=j+1;
      n=q;
    }
    
    System.out.print(j);
    
   
  }
}
