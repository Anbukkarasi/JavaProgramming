import java.util.*;
class Main {
  public static void main(String[] args) {
    System.out.println("Enter N");
    Scanner s = new Scanner(System.in);
    String n = s.next();
    char arr[] = n.toCharArray();
    System.out.println("Enter K");
    int k = s.nextInt();
   
    boolean flag=false;
    
    
      for(int j=0;j<=k;j++)
      {
        for(int i = 0;i<arr.length;i++)
        {
          
          int x = Integer.parseInt(String.valueOf(arr[i]));
         // System.out.print(x);
          if(x == j )
         {
           flag = true;
           break;
          }
        }
        if(!flag)
        {
          break;
        }
      }
     
    
    System.out.print(flag);
    }

    
  }








