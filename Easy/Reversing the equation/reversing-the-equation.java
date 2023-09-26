//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());
        while(t-- > 0)
        {
            String s;
            s = in.readLine().trim();
            
            Solution ob = new Solution();
            
            out.println(ob.reverseEqn(s));    
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
   
    String reverseEqn(String S)
    {
        // your code here
        StringBuilder result = new StringBuilder();
        StringBuilder currentNumber = new StringBuilder();

        for (int i = S.length() - 1; i >= 0; i--) {
            char c = S.charAt(i);

            if (Character.isDigit(c)) {
                currentNumber.append(c);
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                result.append(currentNumber.reverse()).append(c);
                currentNumber.setLength(0); // Clear the currentNumber
            }
        }

        // Add the last number (if any)
        if (currentNumber.length() > 0) {
            result.append(currentNumber.reverse());
        }
        return result.toString();
    }
}

