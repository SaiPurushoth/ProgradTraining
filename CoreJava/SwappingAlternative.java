public class SwappingAlternative
{
    
    
	public static void main(String[] args) {
ArrayList<Integer> ob = new ArrayList<Integer>();
Scanner sc = new Scanner(System.in);
System.out.println("enter the input n");
int n = sc.nextInt();
     for (int i = 0; i < n; i++) {
      int ele=sc.nextInt();
      ob.add(ele);
    }
System.out.println("swapped answer");
        for (int i = 0; i < ob.size()-1; i+=2) {
            
              int temp=ob.get(i);
              ob.set(i,ob.get(i+1));
              ob.set(i+1,temp);
}  
  
    
      for (int i = 0; i < ob.size(); i++) {
      System.out.println(ob.get(i));
    }
    
	}
}
