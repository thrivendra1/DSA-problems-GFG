//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int n = sc.nextInt();
      int a[] = new int[n];
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
      Solution obj = new Solution();
      obj.convertMinToMaxHeap(n,a);
      for(int e : a)
      {
          System.out.print(e+" ");
      }
      System.out.println();
    
System.out.println("~");
}
  }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    static void convertMinToMaxHeap(int N, int arr[]) {
    // code here

        maxheap(N,arr);
        
        // System.out.println(Arrays.toString(arr));

  }
  
  public static void maxheap(int n,int []arr)
  {
      for(int i=(n/2)-1;i>=0;i--)
      {
          heapup(arr,n,i);
      }
  }
  
  public static void heapup(int []arr,int n,int i)
  {
      int larg=i; //assume the largest
      
      int leftchild=2*i+1;
      int rightchild=2*i+2;
      
      
      if(leftchild<n && arr[leftchild]>arr[larg])
      {
          larg=leftchild;
      }
      if(rightchild<n && arr[rightchild]>arr[larg])
      {
          larg=rightchild;
      }
      
      
      if(larg!=i)
      {
          swap(arr,i,larg);
          heapup(arr,n,larg);
      }
  }
  
  
  public static void swap(int []arr,int i, int j)
  {
      int temp=arr[i];
      arr[i]=arr[j];
      arr[j]=temp;
  }
}
     