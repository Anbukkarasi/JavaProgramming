import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int n,q,k;
    
    int j=1;
    Scanner s = new Scanner(System.in);
    n = s.nextInt();
    k = s.nextInt();
    
    while(k!=0)

    {
      j = j *n;
      k=k-1;
    }
    
    System.out.print(j);
    
   
  }
}
