import java.util.*;

class Main {
  public static void main(String[] args) {
    System.out.println("Enter n");
    Scanner s = new Scanner(System.in);    
    int k = s.nextInt();
    int c = 0;
    int q, r,n;
    Hashtable<Integer,Integer> hm=new Hashtable<Integer,Integer>();   
    n = k;
    while(n!=0)
    {
      q = n/10;
      r = n % 10;
      n = q;
      c = c + 1;
    }
    n = k;
    while(n!=0)
    {
      q = n/10;
      r = n % 10;
      n = q;
      hm.put(r,c-1); 
      c = c -1; 
    }
    double sum = 0,d,p;
     for(Map.Entry m:hm.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue()); 
   d = Double.parseDouble(m.getKey().toString());
   p = Double.parseDouble(m.getValue().toString());
   sum = sum + Math.pow(d, p);

  } 
    System.out.println(sum);
  }  
}
