import java.util.*;
class Main {
  public static void main(String[] args) {
    System.out.println("Enter N");
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int count = 0;
    int t;
    boolean flag = false;
    int a[] = new int[n];
    int newArr[] = new int[n];
    for(int i=0;i<n;i++)
    {
      a[i] = s.nextInt();
    }
    for(int i=0;i<n-1;i++)
    {
      
      if(a[i] == i)
      {
        newArr[count] = a[i];
        count=count+1;
      }
    }
    
    for(int i=0;i<count-1;i++)
    {
     for(int j=i+1;j<count;j++)
    {
      
      if(newArr[i] > newArr[j])
      {
        t = newArr[i];
        newArr[i] = newArr[j];
        newArr[j] = t;
      }

    }
    }
    if(count==0)
    {
      System.out.print("-1");
      
    }
    for(int b=0;b<count;b++)
    {
       System.out.print(newArr[b]+" ");
    }

    
  }
}




