import java.util.*;

public class FindDuplicates {

  // ~~~~~~~~~~~~~~~~User's Section~~~~~~~~~~~~~~~~~
  public static List<Integer> findDuplicates(int[] nums) {
    List <Integer> ans = new ArrayList<>();
        
        for(int i = 0 ; i < nums.length ; i++){
            
            int index  = Math.abs(nums[i]) - 1;
            // System.out.println("index= "+ index);
            
            if(nums[index] < 0){
                // System.out.println("i-> " + i + " ," +" index +1-> " + index+1 );
                ans.add(index+1);
            } else{
                nums[index] = -nums[index];
            }
        }
        
        return ans;
  }

  // ~~~~~~~~~~~~~~Input Management~~~~~~~~~~~~~~~
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }

    List<Integer> res = findDuplicates(arr);
    if (res.size() == 0) {
      System.out.println("Empty");
      return;
    }
    Collections.sort(res);
    for (int val : res)
      System.out.print(val + " ");
    System.out.println();
  }
}