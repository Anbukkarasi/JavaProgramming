import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    //str = s.nextLine();
    int n,k;
    boolean flag = false;
    n = s.nextInt();
    k = s.nextInt();
   
    for(int i=n;i<k;i++)
    {
      for(int j=2;j<i;j++)
    {
      if(i%j == 0)
      {
        flag = true;        
        break;
      }
    }
    if(!flag)
    {
      System.out.println(i);
    }
    flag = false;
    }
    
 }
}
