import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter n");
    int n = s.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter "+n+" values");
    for(int i=0;i<n;i++)
    {
      arr[i] = s.nextInt();
    }
    int max = 0;
    
    for(int i=0;i<n;i++)
    {
      int total = 0;
      for(int j=i;j<n;j=j+2)
    {
      total = total + arr[j];
    
    }
    if(total > max)
    {
      max = total;
    }
    }
    System.out.println(max);
    }
  }
