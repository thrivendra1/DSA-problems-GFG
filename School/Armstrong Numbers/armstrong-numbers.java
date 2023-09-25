//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static String armstrongNumber(int n){
        // code here
        int temp=n;
        int total=0;
        while(temp!=0)
        {
            int d=temp%10;
            total=(total)+(d*d*d);
            temp=temp/10;
        }
        
        if(total==n)
        {
            return "Yes";
        }
        else
        {
            return "No";
        }
    }
}