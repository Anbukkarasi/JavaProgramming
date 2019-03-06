import java.util.*;
class Main {
  public static void main(String[] args) {
    System.out.println("Enter N");
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int count = 0;
    boolean flag = false;
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
        for(int b=0;b<count;b++)
      {
        if(a[i] == newArr[b])
        {
          flag = true;
          break;
        }
      }
      if(!flag)
      {
newArr[count] = a[i];
        count = count+ 1;
        break;
    
      }
          }
    }

    }
    if(count==0)
    {
      System.out.print("No repition");
    }
    for(int b=0;b<count;b++)
    {
       System.out.println(newArr[b]);
    }
  }
}



