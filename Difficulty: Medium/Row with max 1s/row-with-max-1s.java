//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int arr[][] = new int[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            int ans = new Solution().rowWithMax1s(arr);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) 
    {
        int target=1;
        int index=-1;
        int first=0;
        int second=0;
        for(int i=0;i<arr.length;i++)
        {
            int low=0;
            int high=arr[i].length-1;
            int ans=-1;

            while(low<=high)
            {
                int mid=(low+high)/2;
                if(arr[i][mid]==target)
                {
                    first=arr[i].length-mid;
                    high=mid-1;
                }
                else
                {
                    low=mid+1;
                }
            }
            if(first>second)
            {
                second=first;
                index=i;
            }
        }
//        if(index>=0)
//        {
//            return index;
//        }
//        return -1;
        return index;
        // code here
    }
}