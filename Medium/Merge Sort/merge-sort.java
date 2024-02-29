//{ Driver Code Starts
import java.util.*;

class Merge_Sort
{
    //method to print the elements of the array
	static void printArray(int arr[])
    {
        StringBuffer sb=new StringBuffer("");
        int n = arr.length;
        for (int i=0; i<n; ++i)
            sb.append(arr[i]+" ");
        System.out.println(sb.toString());
    }

    

	public static void main(String args[])
	{
	    //taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking testcases
		int T = sc.nextInt();
		while(T>0)
		{
		    //taking elements count
			int n = sc.nextInt();
			
			//creating an object of class Merge_Sort
			Merge_Sort ms = new Merge_Sort();
			
			//creating an array of size n
			int arr[] = new int[n];
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

            
			Solution g = new Solution();
			
			//calling the method mergeSort
			g.mergeSort(arr,0,arr.length-1);

            //calling the method printArray
			ms.printArray(arr);
		T--;
		}
	}
}



// } Driver Code Ends


class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
        
         int n1=m-l+1;
        int n2=r-m;

        int larr[]=new int[n1];
        int rArr[]=new int [n2];

        for(int x=0;x<n1;x++)
        {
            larr[x]=arr[l+x];
        }
        for(int x=0;x<n2;x++)
        {
            rArr[x]=arr[m+1+x];
        }
        int i=0;
        int j=0;
        int k=l;
        // write about this code in your notebook
        while (i<n1 && j<n2)
        {
            if(larr[i]<=rArr[j])
            {
                arr[k]=larr[i];
                i++;
                k++;
            }
            else {
                arr[k]=rArr[j];
                j++;
                k++;
            }
        }
        while(i<n1)
        {
            arr[k]=larr[i];
            i++;
            k++;
        }
        while (j<n2)
        {
            arr[k]=rArr[j];
            j++;
            k++;
        }
         
    }
    void mergeSort(int arr[], int l, int r)
    {
        //code here
        if(l<r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }
}
