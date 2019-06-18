import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int k;
    String str;
     
    Scanner s = new Scanner(System.in);
    //str = s.next();
    k = s.nextInt();
    int i = k%2;
    if(i!=0)
    {
      System.out.println(k);
    }
    
    while(k%2==0)
    {
       k = k/2;
       System.out.println(k);
       //l=l-1;
    }
      
  }
}
