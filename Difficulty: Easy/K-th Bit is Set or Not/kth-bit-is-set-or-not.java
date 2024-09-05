//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class CheckBit {
    // Function to check if Kth bit is set or not.
    static boolean checkKthBit(int n, int k) {
        // Your code here
       String nb= digit_to_binary(n);
    //   System.out.println(nb);
    
       int m=0;
        for(int i=nb.length()-1;i>=0;i--)
        {

            if(nb.charAt(i)=='1' && m==k)
            {
                return true;
            }
            m++;
        }
       return false;
    }
    static public String digit_to_binary(int num)
    {
        String result="";
        while(num>0)
        {
            if(num%2==1)
            {
                result=result+'1';
            }
            else
            {
                 result=result+'0';
            }
            num=num/2;
        }
        return reverse(result);
    }
    static public String reverse(String binary)
    {
        String rever="";
        for(int i=binary.length()-1;i>=0;i--)
        {
            rever+=binary.charAt(i);
        }
        return rever;
    }
    
}

//{ Driver Code Starts.

class GFG {
    static int n;
    static int k;

    // Driver Code
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine()); // Inputting the testcases

        while (t > 0) // While testcases exist
        {

            n = Integer.parseInt(br.readLine()); // Input N
            k = Integer.parseInt(br.readLine()); // Input K

            CheckBit obj = new CheckBit();

            if (obj.checkKthBit(n, k))
                System.out.println("Yes"); // If true, print Yes

            else
                System.out.println("No"); // Else print No

            t--;
        }
    }
}
// } Driver Code Ends