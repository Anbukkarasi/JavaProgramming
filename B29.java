import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    //str = s.nextLine();
    int h1,h2,m1,m2;
    
    m1 = s.nextInt();
    
    int h = m1/60;
     m2 = m1%60;

    System.out.print(h);
    System.out.print(" ");
    System.out.print(m2);
   
 }
}
