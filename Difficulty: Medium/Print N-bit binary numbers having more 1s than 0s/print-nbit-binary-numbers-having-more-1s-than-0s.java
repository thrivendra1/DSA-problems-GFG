//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            ArrayList<String> result = ob.NBitBinary(n);
            for(String value  : result){
                System.out.print(value + " ");
            }
            System.out.println();
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    ArrayList<String> NBitBinary(int N) 
    {
        // code here
        ArrayList<String> result = new ArrayList<>();
         generateBinaryNumbers(N, 0, 0, "", result);
        return result;
    }
    
     public void generateBinaryNumbers(int n, int ones, int zeros, String output, ArrayList<String> result) 
     {
        // Base case: When n bits are generated
        if (n == 0) {
            result.add(output);
            return;
        }

        // Always add '1'
        generateBinaryNumbers(n - 1, ones + 1, zeros, output + "1", result);

        // Add '0' only if ones are greater than zeros
        if (ones > zeros) {
            generateBinaryNumbers(n - 1, ones, zeros + 1, output + "0", result);
        }
    }
}