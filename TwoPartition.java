import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the 3 numbers");
    int n = s.nextInt();
    int a = s.nextInt();
    int b = s.nextInt();
    int k = 0;
    
    if(n%2==0)
    {
      int d = n/2;
      while(k<=d)
      {
        k = k + a + b;
        if(k==d)
        {
          break;
        }
      }
      //System.out.println(k+" "+d);
      if(k == d)
      {
        System.out.print("yes");
      }
      else
      {
        System.out.print("no");
      }
    }
    else{
      System.out.print("No");
    }
    
  }
}
