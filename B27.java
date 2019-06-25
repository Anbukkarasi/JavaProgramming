import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    //int n = s.nextInt();
    String str = s.next();
    char arr[] = str.toCharArray();
    boolean flag = true;
    for(int i=0;i<arr.length;i++)
    {
      if( (arr[i] >= 'a' && arr[i] <= 'z') || (arr[i] >= 'A' && arr[i] <= 'Z') )
      {
        flag = false;
      }
    }
    if(flag)
    {
       System.out.println("true");
    }
    else{
       System.out.println("False");
    }
   
  }
}
