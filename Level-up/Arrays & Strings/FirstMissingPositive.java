
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



// #include <bits/stdc++.h>
// using namespace std;
 
// int gcd(int a,int b)
// {
//     if(b%a==0)
//     {
//         return a;
//     }
//     else
//     {
//         return gcd(b%a,a);
//     }
// }
// int main()
// {
//     int n,q;
//     cin>>n >>q;
//     int a[n];
//     for(int i=0;i<n;i++)
//     {
//         cin>>a[i];
//         a[i] = abs(a[i]);
//     }
//     long long ans=0;
//     while(q--)
//     {
//         int l,r;
//         cin>>l>>r;
//         ans+=(gcd(a[l],a[r]));
//     }
//     cout<<ans<<endl;
// return 0;   
// }





// #include<bits/stdc++.h>
// #define ll long long
// #define mod 1000000007
// using namespace std;
// int main()
// {
//     int t;
//     cin>>t;
//     assert(t>=1 && t<=2e4);
//     while(t--)
//     {
//         ll n;
//         cin>>n;
//         assert(n>=3 && n<=1e18);
//         n%=mod;
//         ll a=(n*(n+1))%mod,b=(((2*n+1)%mod)*166666668)%mod;
//         cout<<(a*b)%mod<<"\n";
//     }
//     return 0;
// }



// #include<bits/stdc++.h>
// using namespace std;

// int getMaxScore (int k, vector<int> pages, int n) {
//     // Write your code here
//     long long ans=0;
//     for(int i=0;i<k;i++){
//         if(pages[i]%10<2) ans+=(pages[i]%10);
//         else if(ans==0 && pages[i]%10>1) ans=pages[i]%10;
//         else ans=(ans*(pages[i]%10));
//         ans%=1000000007;
//     }
//     return ans;
// }

// int main() {

//     ios::sync_with_stdio(0);
//     cin.tie(0);
//     int n;
//     cin >> n;
//     int k;
//     cin >> k;
//     vector<int> pages(k);
//     for(int i_pages=0; i_pages<k; i_pages++)
//     {
//         cin >> pages[i_pages];
//     }
//     int out_;
//     out_ = getMaxScore(k, pages, n);
//     cout << out_;
// }