import java.util.*;
class Main {
  public static void main(String[] args) {
    System.out.println("Enter N");
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int count = 0;
    boolean flag = false;
    boolean isavail = false;
    int a[] = new int[n];
    int newArr[] = new int[n];
    for(int i=0;i<n;i++)
    {
      a[i] = s.nextInt();
    }
    for(int i=0;i<n-1;i++)
    {
     for(int j=i+1;j<n;j++)
    {
      
      if(a[i] == a[j])
      {
       flag = true;
       newArr[count] = a[i];
       count = count +1;
       break;
      }
      
    }
     
     if(!flag)
     {
       for(int x=0;x<count;x++)
       {
         //System.out.print(newArr[x]);
         if(a[i] == newArr[x])
         {
           isavail = true;
           break;
         }
       }
       if(!isavail)
       {
          System.out.print(a[i]);
       }
      
     }
      flag = false;
    }

    
  }
}






