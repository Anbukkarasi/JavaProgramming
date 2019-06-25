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
    int min = 0;
    for(int i=0;i<10;i++)
    {
      if(a[i] <  max )
      {
        min = a[i];
      }
    }
    System.out.println(min);
  }
}
