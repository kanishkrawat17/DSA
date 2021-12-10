
import java.util.Scanner;

public class MaximumAvgSubarray1 {
  public static double solution(int nums[], int k) {
        int sum = 0;
        // its all about finding the maximum sum whose maximum will be largest 
        //automatically average will be larger ( Sliding window concept)
        for(int i = 0 ; i < k; i++ ){
            sum += nums[i];
        }
        
        int max = sum;
        
        for(int i = k; i < nums.length; i++){
            sum = sum + nums[i] - nums[i-k];
            max = Math.max(max, sum);
        }
        
        return (max * 1.0) / k;

  }
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int nums[] = new int[n];
    for (int i = 0 ; i < n ; i++) {
      nums[i] = scn.nextInt();
    }
    int k = scn.nextInt();

    System.out.println(solution(nums, k));
  }
}