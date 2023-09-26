//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isDigitSumPalindrome(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int isDigitSumPalindrome(int N) {
        // code here
        int number=N;
        int total=0;
        while(number>0)
        {
            int digit=number%10;
            total=total+digit;
            number/=10;
        }
        
        int totalnumber=total;
        int rev=0;
        
        while(totalnumber>0)
        {
            int digit=totalnumber%10;
            rev=rev*10+digit;
            totalnumber/=10;
        }
        if(rev==total)
        {
            return 1;
        }
        return 0;
    }
}