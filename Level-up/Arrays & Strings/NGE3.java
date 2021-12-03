import java.util.*;
// this is leetcode solution , for n= 2147483647 , it was throwing mumber.exceoption error
// Integer.MAX_VALUE=  == 2147483647
public class NGE3 {

    public static int nextGreaterElement(int n) {
        String str = Integer.toString(n);
        char[] arr = str.toCharArray();

        // find first dip -> start from arr.len - 2 index & compare arr[i] & arr[i+1]
        // first dip is when -> arr[i] < arr[i+1] (when we encounter the smaller elt)
        int i = arr.length - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        if (i >= 0) {
            for (int k = arr.length - 1; k >= 0; k--) {
                if (arr[i] < arr[k]) {
                    // swapping
                    char temp = arr[k];
                    arr[k] = arr[i];
                    arr[i] = temp;
                    break;
                }
            }
        } else {
            // no next greater exist -> ex if n = 653 , then no next greater exist
            return -1;
        }

        // reverse from (i+1 to arr.length-1)
        String result = "";
        for (int idx = 0; idx <= i; idx++) {
            result += arr[idx];
        }
        for (int idx = arr.length - 1; idx > i; idx--) {
            result += arr[idx];
        }

        // converting into long
        long ans = Long.parseLong(result);
        // checking , if ans is lesser then Integer.MAX_VALUE or not , Integer.MAX_VALUE=  == 2147483647
 
        if (ans <= Integer.MAX_VALUE) {
            return (int) ans;
        } else {
            return -1;
        }

    }

    // ~~~~~~~~~~~~~~~~~Input Management~~~~~~~~~~~~~~~~~
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int res = nextGreaterElement(num);

        System.out.println(res);
        scn.close();
    }
}