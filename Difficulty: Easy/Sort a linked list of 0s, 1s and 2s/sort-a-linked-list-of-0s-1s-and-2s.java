//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}


// } Driver Code Ends
// User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) 
    {
        if(head==null || head.next==null)
        {
            return head;
        }

        // merger sort 

        Node middle=findmid(head);

        Node left=head;
        Node right=middle.next;
        middle.next=null;

        left=segregate(left);
        right=segregate(right);

        return merge(left,right);
        
        // add your code here
    }
    
   static public Node findmid(Node head)
    {
        Node slow=head;
        Node fast=head.next;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next; //we get out middle here

            fast=fast.next.next;
        }
        return slow;
    }
    
   static public Node merge(Node left,Node right)
    {
            Node dummy=new Node (-1); //  we are creating a dummy Node to store the sort value
            Node temp=dummy;
            while(left!=null && right!=null)
            {
                if(left.data<right.data)
                {
                    temp.next=left;
                    temp=left;
                    left=left.next;
                }
                else
                {
                    temp.next=right;
                    temp=right;
                    right=right.next;
                }
            }

            // if left have 3 Node and right was 2 Node 
            // the left last node was remaing that why we use this if else 

            if(left!=null)  // we checking left!=null
            {
                temp.next=left;
            } 
            else if(right!=null)
            {
                temp.next=right;
            }

        return dummy.next;

    }
}


//{ Driver Code Starts.

class GFG {
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            String input = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(input);
            while (st.hasMoreTokens()) {
                arr.add(Integer.parseInt(st.nextToken()));
            }

            Node head = null;
            if (!arr.isEmpty()) {
                head = new Node(arr.get(0));
                Node tail = head;
                for (int i = 1; i < arr.size(); i++) {
                    tail.next = new Node(arr.get(i));
                    tail = tail.next;
                }
            }
            head = new Solution().segregate(head);
            printList(head);
        }
    }
}
// } Driver Code Ends