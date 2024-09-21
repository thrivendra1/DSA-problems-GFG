//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            sc.nextLine();
            String s = sc.next();
            Solution obj = new Solution();
            String ans = obj.postToInfix(s);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static String postToInfix(String exp) {
        // code here
        
        int size = exp.length();
        Stack<String> st = new Stack<>();

        for (int i = 0; i < size; i++) { // Time Complexity -> O(N)
            char letter = exp.charAt(i);

            // If it's an operand (letter or digit), push it to the stack
            if (isOperand(letter)) {
                st.push(Character.toString(letter));
            }
            // If it's an operator, pop two operands from the stack
            else {
                String operand2 = st.pop();  // right operand
                String operand1 = st.pop();  // left operand
                String result = "(" + operand1 + letter + operand2 + ")";  // Combine in infix format  TC -> O(N1+N2)
                st.push(result);  // Push the result back onto the stack
            }
        }

        // The final expression on the stack is the full infix expression
        return st.peek();
    }
    
    static public boolean isOperand(char c) {
        return Character.isLetterOrDigit(c);
    }
}
