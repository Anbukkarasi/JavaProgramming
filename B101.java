import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int k;
    String str;
     
    Scanner s = new Scanner(System.in);
    str = s.next();
    k = s.nextInt();
    char a[] = str.toCharArray();
    int l = a.length - 1;
    for(int i=0;i<k;i++)
    {
       System.out.print(a[l]);
       l=l-1;
    }
      
  }
}
