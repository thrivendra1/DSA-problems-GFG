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

class GfG {
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data);
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str[] = read.readLine().trim().split(" ");
            int n = str.length;
            Node head = new Node(Integer.parseInt(str[0]));
            Node tail = head;
            for (int i = 1; i < n; i++) {
                tail.next = new Node(Integer.parseInt(str[i]));
                tail = tail.next;
            }
            Solution obj = new Solution();
            head = obj.addOne(head);
            printList(head);
        }
    }
}
// } Driver Code Ends


/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node addOne(Node head) 
    {
        // code here.
        
        //Apporach-1 T
        head=reverse(head);
        Node temp=head;
        int carray=1;
        
        while(temp!=null)
        {
            temp.data=temp.data+carray;
            if(temp.data<10)
            {
                carray=0;
                break;
            }
            else
            {
                temp.data=0;
                carray=1;
                
            }
            temp=temp.next;
        }
        
        if(carray==1)
        {
            Node newNode=new Node (1);
            head=reverse(head);
            newNode.next=head;
            return newNode;
        }
        return reverse(head);
    }
    
    public Node reverse(Node head)
    {
        Node current=head;
        Node prev=null;
        Node next = null;
        while(current!=null)
        {
           next=current.next;
           current.next=prev;
           prev=current;
           current=next;
        }
        return head=prev;
    }
}
