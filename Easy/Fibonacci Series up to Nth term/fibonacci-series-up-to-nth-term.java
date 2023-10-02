//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            long ans[] = obj.Series(n);
            for (long i : ans) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {

    long[] Series(int N) {
        // code here
        long[] fib=new long[N+1];
        if(N==0)
        {
            return fib;
        }
        if(N==1)
        {
            fib[1]=1;
            return fib;
        }
        fib[0]=0;
        fib[1]=1;
        for(int i=2;i<=N;i++)
        {
            fib[i]=fib[i-1]+fib[i-2];
        }
        return fib;
    }
}