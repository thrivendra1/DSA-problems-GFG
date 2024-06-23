//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().count(arr, n, x);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution {
    int count(int[] arr, int n, int x) {
        // code here
        // int count=0;
        // for(int i=0;i<n;i++)
        // {
        //     if(arr[i]==x)
        //     {
        //         count++;
        //     }
        // }
        // return count;
        int f=first(arr,n,x);
        int l=last(arr,n,x);
        if(l==-1) return 0;
        int ans=l-f+1;
        return ans;
    }
    public int first(int []arr,int n,int x)
    {
        int low=0;
        int high=n-1;
        int idx=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==x)
            {
                idx=mid;
                high=mid-1;
            }
           else if(x<arr[mid])
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return idx;
    }
    
        public int last(int []arr,int n,int x)
    {
        int low=0;
        int high=n-1;
        int idx=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==x)
            {
                idx=mid;
                low=mid+1;
            }
           else if(x<arr[mid])
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return idx;
}
}