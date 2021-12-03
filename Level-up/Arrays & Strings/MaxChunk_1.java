import java.util.*;

public class MaxChunk_1 {

   
    public static int maxChunksToSorted(int[] arr) {
          int len = arr.length;
        int max = Integer.MIN_VALUE;
        int chunkCount  = 0;
        
        for(int i = 0 ; i < len ; i++){
           max = Math.max(max, arr[i]);
            //this is an important step 
            if( i  == max){
                chunkCount++;
            }
        }
        
        return chunkCount; 
    }

    // ~~~~~~~~~~~~Input Management~~~~~~~~~~~~~~~~
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int res = maxChunksToSorted(arr);
        System.out.println(res);
    }
}