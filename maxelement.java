import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
   // int n = s.nextInt();
    int a[] = new int[10];
    for(int i=0;i<10;i++)
    {
      a[i] = s.nextInt();
    }
    int m = 0;
    for(int i=0;i<10;i++)
    {
      if(a[i] >  m )
      {
        m = a[i];
      }
    }
    System.out.println(m);
  }
}
