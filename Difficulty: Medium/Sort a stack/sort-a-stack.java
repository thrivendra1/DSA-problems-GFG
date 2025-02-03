//{ Driver Code Starts
import java.util.*;
import java.util.Scanner;
import java.util.Stack;

class SortedStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Stack<Integer> s = new Stack<>();
            int n = sc.nextInt();
            while (n-- > 0) s.push(sc.nextInt());
            GfG g = new GfG();
            Stack<Integer> a = g.sort(s);
            while (!a.empty()) {
                System.out.print(a.peek() + " ");
                a.pop();
            }
            System.out.println();
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


/*Complete the function below*/
class GfG {
    public Stack<Integer> sort(Stack<Integer> s) {
        // add code here.
        
        //base condition
        if(s.size()==1)
        {
            return s;
        }
        
        //hypothis
        
        int temp=s.get(s.size()-1);
        s.remove(s.size()-1);
        sort(s);
        
        
        //indction
        
        adding(s,temp);
        return s;
    }
    
    public static void  adding(Stack<Integer> data,int temp)
    {
        //base case 
        
        if(data.isEmpty() || temp>data.peek()  )
        {
            data.push(temp);
            return ;
        }
        
        //hypothis
        
       int val=data.pop();
        adding(data,temp);
        
        
        //inction
        
        data.add(val);
        
    }
}