import java.util.*;

public class PartitionLables {

  // ~~~~~~~~~~~~~~~User Section~~~~~~~~~~~~~~~
  public static List<Integer> partitionLabels(String s) {
      List<Integer> ans = new ArrayList<>();
        HashMap<Character, Integer> hm = new HashMap<>();
        
        int max = Integer.MIN_VALUE;
        int prevIdx = -1;

        // storing last occurence of a char or storing whats the last idx at which this character has impact on
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            hm.put(ch, i);
        }
            // filling elets in ans arraylist
        for(int i = 0 ; i < s.length() ; i++){
            max =  Math.max(max, hm.get(s.charAt(i)));
            if( i == max){
                ans.add(i-prevIdx);
                prevIdx = i ;
            }
        }
        return ans;
  }

  // ~~~~~~~~~~~~~Input Management~~~~~~~~~~~~~~~
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.nextLine();

    List<Integer> res = partitionLabels(str);
    for (int val : res) {
      System.out.print(val + " ");
    }
  }
}