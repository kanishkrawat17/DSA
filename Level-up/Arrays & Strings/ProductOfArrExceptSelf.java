
import java.util.*;

public class ProductOfArrExceptSelf {
    
    //~~~~~~~~~~~~~~~~~User Section~~~~~~~~~~~~~~~
    public static int[] productExceptSelf(int[] arr) {
        // write your code here'
        int answer [] = new int [arr.length];
        int temp = 1;
        int i = 0 ;
        for(i = 0 ; i < arr.length ; i++){
            answer[i] = temp;
            temp *= arr[i];
        }
        
        temp = 1;
        for( i = arr.length-1 ; i >=  0 ; i--){
            answer[i] = temp * answer[i];
            temp =  temp * arr[i];
        }
        
        return answer;
    }

    //~~~~~~~~~~~~~~~~~Input Management~~~~~~~~~~~~~~~
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int[] res = productExceptSelf(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}