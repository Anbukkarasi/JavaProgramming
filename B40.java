import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int f0=0,f1=1,f2;
     System.out.print(f0);
     System.out.print(" ");
     System.out.print(f1);
    for(int i=0;i<n;i++)
    {
      f2 = f0 + f1;
      System.out.print(" " + f2+ " ");
      f0 = f1;
      f1 = f2; 
    }
    
  }
}
