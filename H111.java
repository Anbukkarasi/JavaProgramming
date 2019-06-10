import java.util.*;

class Main {
  public static void main(String[] args) {
    System.out.println("Enter N");
    Scanner s = new Scanner(System.in);    
    int n = s.nextInt();
    
    int count=0;
    
       
    int a[][] = new int[n][n];
        
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      {
        a[i][j] = s.nextInt();
      }
        
    }

    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      {
        if(i == j)
        {
          count = count + a[i][j];
        }
        
      }
        
    }
  System.out.println(count);
  }  
}
