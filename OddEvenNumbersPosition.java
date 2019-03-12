import java.util.*;
class Main {
  public static void main(String[] args) {
    System.out.println("Enter N");
    Scanner s = new Scanner(System.in);    
    int n = s.nextInt();
    System.out.println("Enter "+n+ " elements");
    int count = 0;
    int a[] = new int[n];
    int newArr[] = new int[n];
    for(int i=0;i<n;i++)
    {
      a[i] = s.nextInt();
    }
    for(int i=0;i<n;i++)
    {
       if(a[i] % 2 == 0)
       {
         if(i%2!=0)
         {
           newArr[count] = a[i];
           count = count + 1;
         }
       }
       else
       {
         if(i%2==0)
         {
           newArr[count] = a[i];
           count = count + 1;
         }
       }
      
     
    } 
        for(int i=0;i<count;i++)
    {
      System.out.print(newArr[i]+" ");
    }

  
  }
}





