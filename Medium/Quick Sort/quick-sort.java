//{ Driver Code Starts
import java.util.*;
class Sorting
{
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    
    // Driver program
    public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

			
			new Solution().quickSort(arr,0,n-1);
			printArray(arr);
		    T--;
		}
} }
// } Driver Code Ends


class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        // code here
         if(low<high)
        {
            int pi=partition(arr,low,high);
            quickSort(arr,low,pi-1);
             quickSort(arr,pi+1,high);
        }
    }
    static int partition(int arr[], int low, int high)
    {
        // your code here
        int pivot=arr[high];
        int k=low-1;
        for(int i=low;i<high;i++)
        {
            if(pivot>arr[i])
            {
                k++;
                int temp=arr[k];
                arr[k]=arr[i];
                arr[i]=temp;
            }
        }
        k++;
        int temp=arr[k];
        arr[k]=arr[high];
        arr[high]=temp;
        return k;
       
    } 
}
