//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine().trim();
            Solution ob = new Solution();
            ArrayList<String> ans = new ArrayList<String>();
            ans = ob.permutation(S);

            for (int i = 0; i < ans.size(); i++) {
                System.out.print("(" + ans.get(i) + ")");
            }
            System.out.println();
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {

    ArrayList<String> permutation(String input) 
    {
        String output=String.valueOf(input.charAt(0));
        ArrayList<String> result=new ArrayList<>();

        fun(input,output,1,result);
        return result;
        // Code Here
    }
    
    static public void fun(String input,String output,int index,ArrayList<String> result)
    {

        //base

        if(index>=input.length())
        {

            // result.add("("+output+")");
            result.add(output);

            // System.out.println(output);
            return;
        }

        String op1=output;
        String op2=output;
        op1+=" "+input.charAt(index);
        op2+=input.charAt(index);

        fun(input,op1,index+1,result);

        fun(input,op2,index+1,result);


    }
}