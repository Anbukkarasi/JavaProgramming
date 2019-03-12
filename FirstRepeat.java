import java.util.*;
class Main {
  public static void main(String[] args) {
    System.out.println("Enter N");
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int count = 0;
    boolean flag = false;
    boolean isFirst = true;
    int a[] = new int[n];
    int newArr[] = new int[n];
    int repeatIndex=0, maxIndex=0, repeatItem=0;
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
          if(isFirst)
          {
            repeatIndex = j;
            repeatItem = a[i];
            isFirst = true;
          }
          if(!isFirst && j>repeatIndex)
          {
            repeatIndex = j;
            repeatItem = a[i];
          }
          break;
        }
      }
      
    } 
        
      System.out.print(repeatItem);

  
  }
}





