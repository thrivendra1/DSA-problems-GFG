//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            System.out.println(
                new Solution().infixToPostfix(br.readLine().trim()));
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to convert an infix expression to a postfix expression.
    public static String infixToPostfix(String exp) 
    {
        int i=0,size=exp.length();
        
        Stack<Character> st=new Stack<>();
        
        String result="";
        
        while(i<size)
        {
            char letter=exp.charAt(i);
            if(Character.isLetterOrDigit(letter))
            {
                result+=letter;
            }
            
            else if(letter=='(')
            {
                st.push(letter);
            }
            
            else if(letter==')')
            {
                while(!st.isEmpty() && st.peek()!='(')
                {
                    result+=st.pop();
                }
                st.pop();
            }
            else
            {
                while(!st.isEmpty() && priority(letter)<=priority(st.peek()))
                {
                    result+=st.pop();
                }
                st.push(letter);
            }
            
            i++;
        }
        
        while(!st.isEmpty())
        {
            if(st.peek()=='(') return "Invalid experssion";
            
            result+=st.pop();
        }
        return result;
    }
    
    public static int priority(char c)
    {
        if(c=='+' || c=='-') return 1;

        else if(c=='*' || c=='/') return 2;

        else if(c=='^') return 3;
        return -1;
    }
}