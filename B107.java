import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int a,b,c;
    String str;
     
    Scanner s = new Scanner(System.in);
    //str = s.nextLine();
    a = s.nextInt();
    b = s.nextInt();
    c = s.nextInt();
    
    System.out.print((a*b)/c);
  }
}
