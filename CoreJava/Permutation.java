import java.util.*;
public class Permutation
{
 static int factorial(int n){    
  if (n == 0)    
    return 1;    
  else    
    return(n * factorial(n-1));    
 }    
 
 static int countPermutation(String str) {
     int[] freq = new int[26];  
    for(int i = 0; i<26; i++) {
      freq[i]=0;
   }
   for(int i = 0; i<str.length(); i++) {
       char k=str.charAt(i);
       int d=k;
       int z=d-97;
      freq[z]++;
   }
   int res = factorial(str.length()); 
   
   for(int i = 0; i<26; i++) {
      if(freq[i] > 1)
         res /= factorial(freq[i]); 
   }
   return res;
}
 
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str =  sc.nextLine();
    
    
    System.out.println(countPermutation(str));
    }
}
