import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    //str = s.nextLine();
    int n,k;
    n = s.nextInt();
    k = s.nextInt();
   
    for(int i=n;i<k;i++)
    {
      if(i%2 != 0)
      {
        System.out.println(i);
      }
    }
 }
}
