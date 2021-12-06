import java.util.*;

public class ValidPalindrome_II {

 public static boolean isPalindrome(String s, int i , int j ){
     
     int hi = i ;
     int lo = j;
     
     while(hi < lo){
         if(s.charAt(hi) != s.charAt(lo)){
             return false;
         }
         hi++;lo--;
     }
     
     return true;
 }
  public static boolean validPalindrome(String s) {
    int i = 0, j = s.length() - 1;
    while (i <= j) {

      if (s.charAt(i) == s.charAt(j)) {
        i++;
        j--;
      } 
      
      if(s.charAt(i) != s.charAt(j)){
          //case -1 ->check from i+1 to j . if palindrome or not
          //case -2 -> check from i to j+1 . if palindrome or not
          // if any of the condition is true then it is palindrome
          
          if(isPalindrome(s, i+1 , j) || isPalindrome(s,i,j-1)){
              return true;
          } 
          return false;
      }
    }
    
    return true;
  }

  // ~~~~~~~~~~~~Input Management~~~~~~~~~~~~~~~~
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.nextLine();

    boolean res = validPalindrome(str);
    System.out.println(res);
  }
}
