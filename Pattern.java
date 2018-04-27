import java.util.*;
class Main {
  public static void main(String[] args) {
    System.out.println("ENTER 2 NUMBERS");
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int k = s.nextInt();
    int arr[] = new int[n];
    System.out.println("ENTER " + n +" NUMBERS");
    for(int j=0;j<n;j++)
    {
      arr[j] = s.nextInt();
    }
    boolean flag = false;
    for(int b=0;b<n;b++)
    {
      for(int c=0;c<n;c++)
      {
      if(arr[b] + arr[c] == k)
      {
        flag = true;
      }
      }
    }
    System.out.println(flag);
  }
}
