import java.util.*;

public class Max_Product_3_Nums {
    //Step 1 -> find max 1 , max2 , max3 & return max1 * max2 * max3 
    // this will fail bcs if arr=[ -7, -6 , 5, 4, 2] then max1=5, max2=4 , max3=3 and prdouct = 60 , whihc is wrong 
    // this will fail for if negative nums are there in array
    // bcs -7 (min1) * -6(min2) = 56    >  60 (product )
    // New Step -> find min1 and min2 and then return Math.max(min1 * min2 * max1 , max1 * max2  * max3);
     public static int maximumProduct(int[] arr) {
       int min1  = Integer.MAX_VALUE ,  min2 = Integer.MAX_VALUE;
       int max1 = Integer.MIN_VALUE , max2 = Integer.MIN_VALUE ,  max3 = Integer.MIN_VALUE ;
        
        for(int val : arr){
            
            // find max1, max2, max3
            if(val > max1){
                max3 = max2;
                max2 = max1;
                max1 = val;
            } else if(val > max2){
                max3 = max2;
                max2 = val;
            } else if(val > max3){
                max3 = val;
            }
            
            //find min1, min2
            if( val < min1){
                min2 = min1;
                min1 = val;
            } else if(val < min2){
                min2 = val;
            }  
        }
        
        return Math.max(min1 * min2 * max1 , max1 * max2  * max3);
    }

    // ~~~~~~~~~~~~~~~~Input Management~~~~~~~~~~~
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int prod = maximumProduct(arr);
        System.out.println(prod);
        scn.close();
    }
}