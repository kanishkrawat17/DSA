
import java.util.*;

public class FirstMissingPositive {


  //~~~~~~~~~~~~~~~User's Section~~~~~~~~~~~~~~~~~
        // Arrays.sort(arr);
        
        // boolean countOfOne = false;
        // for(int i = 0  ; i < arr.length ; i++){
            
        //     if(arr[i] < 0 ){
        //         continue;
        //     } else if(arr[i] == 0){
        //         continue;
        //     } else if(arr[i] == 1){
        //         countOfOne = true;
        //     } else if(arr[i] != 1 && countOfOne == false){
        //         return 1;
        //     }
            
            
            
        //     if( i+1 <  arr.length && arr[i+1] - arr[i] != 1){
        //         return arr[i] + 1;
        //     }
        // }
        
        // return arr.length;
  public static int firstMissingPositive(int[] arr) {
    boolean presenceOfOne = false;
        
        // Step1 -> mark the presence of one and also manage elts whihc are out of range.
        int n = arr.length;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 1)
                presenceOfOne = true;
            
            if(arr[i] < 1 || n < arr[i]){
                arr[i] = 1 ;
            }
        }
        
        if(presenceOfOne == false)
            return 1;
        
        // Step2 -> map the elements with index.
        for(int i = 0 ;  i < n ; i++){
            int index = Math.abs(arr[i]);
            arr[index-1] = -Math.abs(arr[index-1]);
        }
        
        //Step3 -> find the missing element.
        for(int i = 0 ; i < n ; i++){
            if(arr[i] > 0 )
                return i+1;
        }
        
        return n+1;
    
       
  }

  //~~~~~~~~~~~~~Input Management~~~~~~~~~~~~~~~
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }

    int res = firstMissingPositive(arr);
    System.out.println(res);
  }
}