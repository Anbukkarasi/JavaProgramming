import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int n=3,k=2;
    
    int j=0;
    Scanner s = new Scanner(System.in);
    n = s.nextInt();
    k=s.nextInt();
    int a[] = new int[n];
    for(int i=0;i<k;i++)
    {
      a[i] = s.nextInt();
    }
    for(int i=0;i<k;i++)
    {
      j = j + a[i];
    }
    
    System.out.print(j);
    
   
  }
}
