/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public int getKthFromLast(Node head, int k) {
        // code here
        
        int count = 1;
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
            count++;
        }
        
       
        if(count == k) return head.data;
        if(k > count) return -1;
        
        temp = head;
        while(count != k){
            temp = temp.next;
            count--;
        }
        return temp.data;
    }
}