//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GfG {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            // Read values array
            String[] valueInput = br.readLine().trim().split(" ");
            List<Integer> values = new ArrayList<>();
            for (String s : valueInput) {
                values.add(Integer.parseInt(s));
            }

            // Read weights array
            String[] weightInput = br.readLine().trim().split(" ");
            List<Integer> weights = new ArrayList<>();
            for (String s : weightInput) {
                weights.add(Integer.parseInt(s));
            }

            // Read the knapsack capacity
            int w = Integer.parseInt(br.readLine().trim());

            // Call fractionalKnapsack function and print result
            System.out.println(String.format(
                "%.6f", new Solution().fractionalKnapsack(values, weights, w)));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    // Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(List<Integer> val, List<Integer> wt, int capacity) 
    {
        int size=val.size();
        item items[]=new item[size];
        
        
        // add the val and wt to item class
        
        for(int i=0;i<size;i++)
        {
            items[i]=new item(val.get(i),wt.get(i));
        }
        
        // sorting
        
        Arrays.sort(items,(a,b)->Double.compare((double)b.val/b.wt, (double)a.val/a.wt));
        
        
        double totalval=0.0;
        
        for(item t:items)
        {
            if(capacity==0) break;
            
            
            if(t.wt<=capacity)
            {
                totalval+=t.val;
                capacity-=t.wt;
            }
            
            else
            {
                totalval+=(double) t.val*capacity/t.wt;
                capacity=0;
            }
        }
        
        return totalval;
        
    }
}

class item
{
    int val,wt;
    
    public item(int val,int wt)
    {
        this.val=val;
        this.wt=wt;
    }
}