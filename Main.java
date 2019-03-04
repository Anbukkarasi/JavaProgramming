class Main {
  public static void main(String[] args) {
    String s = "aabbcc";
    char arr[] = s.toCharArray();
    int len = arr.length;
    int j=0;
    char toArr[] = new char[len];
    for(int i=len-1;i>=0;i--)
    {
      toArr[j] = arr[i];
      j++;
    }
    String s2 = String.valueOf(toArr);
    System.out.println(s2);
    
    
  }
}
