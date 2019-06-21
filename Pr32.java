import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int m = s.nextInt();
    int n = s.nextInt();
    int t;
    int a[][] = new int[m][n];
    for(int i =0;i<m;i++)
    {
      for(int j=0;j<n;j++)
      {
        a[i][j] = s.nextInt();
      }
    }
     for (int i = 0; i < m; i++)
      { 
  
            // loop for column of matrix 
            for (int j = 0; j < n; j++)
             { 
  
                // loop for comparison and swapping 
                for (int k = 0; k < n-1; k++)
                 { 
                    if (a[i][k] > a[i][k + 1])
                     { 
                        t = a[i][k]; 
                        a[i][k] = a[i][k + 1]; 
                        a[i][k + 1] = t; 
                    } 
                } 
            }
      } 

        
  
    for(int i =0;i<m;i++)
    {
      for(int j=0;j<n;j++)
      {
        System.out.print(a[i][j]);
         System.out.print(" ");
      }
       System.out.println();
    }
    
  }
}
