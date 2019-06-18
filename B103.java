import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int k;
    String str;
     
    Scanner s = new Scanner(System.in);
    str = s.nextLine();
   // k = s.nextInt();
    int l = str.length();
    String w[] = str.split(" ");
    for(String j:w)
    {
      System.out.print(j.substring(0,1).toUpperCase());
      System.out.print(j.substring(1,j.length()));
       System.out.print(" ");
    }
      
  }
}
