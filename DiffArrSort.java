import java.util.*;
class Main {
  public static void main(String[] args) {
    System.out.println("Enter N");
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int count = 0,t;
    int a[] = new int[20];
    for(int i=1;i<=n;i++)
    {
      System.out.println("Enter "+i+" array size");
      int si =  s.nextInt();
      for(int k=0;k<si;k++)
      {
        a[count] = s.nextInt();
        count=count+1;
      }
    }
   
   for(int i=0;i<count;i++)
    {
      for(int j=0;j<count;j++)
    {
      
      if(a[i] < a[j])
      {
        t = a[i];
        a[i] = a[j];
        a[j] = t;
      }
    }
    }
    for(int i=0;i<count;i++)
    {
      System.out.print(a[i]);
    }
   
  }
}





