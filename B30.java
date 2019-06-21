import java.util.Scanner;
import java.lang.Math;
class Main {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    //str = s.nextLine();
    int h1,h2,m1,m2;
    h1 = s.nextInt();
    m1 = s.nextInt();
    h2 = s.nextInt();
    m2 = s.nextInt();
    int ans1 = h1 - h2;
    int ans2 = m1 - m2;
    System.out.print(Math.abs(ans1));
    System.out.print(" ");
    System.out.print(Math.abs(ans2));
   
 }
}
