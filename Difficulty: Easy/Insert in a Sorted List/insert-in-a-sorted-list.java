/*class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }*/

// sortedInsert method should return the head of the modified linked list.
class Solution {
    Node sortedInsert(Node head, int key) {
        // Add your code here.
        Node newNode = new Node(key);
        
        if(head == null || head.data > key) {
            newNode.next = head;
            head = newNode;
            return head;
        }
        
        Node prev = null;
        Node temp = head;
        while(temp!= null && temp.data < key){
            prev = temp;
            temp = temp.next;
        
        }
        
        prev.next = newNode;
        newNode.next = temp;
        
        return head;
    }
}