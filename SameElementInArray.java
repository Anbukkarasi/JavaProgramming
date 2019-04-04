import java.util.*;
class Main {
  public static void main(String[] args) {
    System.out.println("Enter N");
    Scanner s = new Scanner(System.in);    
    int n = s.nextInt();
    System.out.println("Enter K");
    int k = s.nextInt();
    int count=0;
    
    boolean flag = false;
   
    int a[][] = new int[n][k];
    int fin[][] = new int[n][k];
    int newArr[] = new int[n*k];
    
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<k;j++)
      {
        a[i][j] = s.nextInt();
      }
        
    }
    int z=0,l=0,m=0;
    while(z<k)
    {
      outer:
      for(int i=1;i<n;i++)
      {
     
      for(int j=0;j<k;j++)
      {
    
     
        if(a[0][z] == a[i][j])
        {
          
          flag = true;
          count=count+1;
          break;
        }
      }
        if(!flag)
        {
          break outer;
        }
        
        //z=z+1;
    }
    if(count==n-1)
    {
      newArr[l]  = a[0][z];
          l=l+1;
    }
    z=z+1;
    count = 0;
    }
    
    for(int i=0;i<l;i++)
    {
      System.out.print("aa"+newArr[i]);
    }
    
}
}





