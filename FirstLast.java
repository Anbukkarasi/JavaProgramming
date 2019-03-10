import java.util.*;
class Main {
  public static void main(String[] args) {
    System.out.println("Enter N");
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int count = 0, first=0,last=0;
    int q,r=0;
    boolean flag=false;
    while(n!=0)  
    {
      q = n / 10;
      r = n % 10;
      if(!flag)
      {
        first = r;
        flag = true;
       //  System.out.print(first);
      }
     
      n = q;
      if(n==0)
      {
        last = r;
       // System.out.print(last);
      }
    }
    int sum = first + last;
    System.out.print("Sum of first and last:"+sum);
    }

    
  }








