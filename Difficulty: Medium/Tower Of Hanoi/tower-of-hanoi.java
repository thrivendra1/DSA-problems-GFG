//{ Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // total testcases
        while (T-- > 0) {
            Solution obj = new Solution();
            int N;

            // taking input N
            N = sc.nextInt();

            // calling toh() method
            System.out.println(obj.towerOfHanoi(N, 1, 3, 2));

            System.out.println("~");
        }
    }
}

// } Driver Code Ends




// User function Template for Java

class Solution {
    int a = 0;
    public int towerOfHanoi(int n, int from, int to, int aux) {
        // Your code here
                    
        if (n == 0) return a; 
        towerOfHanoi(n - 1, from, aux, to); 
        a++; // Move current disk
        towerOfHanoi(n - 1, aux, to, from); 

        return a; // Return total moves
    }
}
