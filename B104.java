import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int k,sum=1,n;
    String str;
     
    Scanner s = new Scanner(System.in);
    //str = s.nextLine();
    n = s.nextInt();
    k = s.nextInt();
    while(k!=0)
    {
      sum = sum * n;
      System.out.println(sum);
      k=k-1;
    }
      System.out.print(sum);
  }
}
