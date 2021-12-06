import java.util.*;

public class ReverseVowels {
 
 public static void swap(char [] arr , int i, int j){
     char temp = arr[i];
     arr[i] = arr[j];
     arr[j] = temp;
 }

 public static boolean isVowel(char []arr , int idx){
     char ch = arr[idx];
     if(ch == 'a' || ch  == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch  == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){             
         return true;
     }
     return false;
 }


  public static String reverseVowels(String s) {
    int i = 0 , j =  s.length()-1;
    char [] str = s.toCharArray();

    while(i < j ){
        if(isVowel(str,i) && isVowel(str,j) ){
            swap(str, i , j);
            i++;
            j--;
        } else if(isVowel(str,i)){
            j--;
        } else if(isVowel(str,j)){
            i++;
        } else{
            i++;
            j--;
        }
    }
    String res = "";
    for(char ch : str){
        res = res + ch;
    }
    return res;
  }

  // ~~~~~~~~~~~~Input Management~~~~~~~~~~
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.nextLine();

    String res = reverseVowels(str);
    System.out.println(res);
    scn.close();
  }
}

