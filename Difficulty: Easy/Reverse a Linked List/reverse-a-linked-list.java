/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node reverseList(Node head) {
        // code here
        if(head == null) return null;
        
        Node prev = null;
        Node curr = head;
        Node n  = curr.next;
        
        while(curr != null){
            n = curr.next;
            curr.next = prev;
            prev = curr;
            curr = n;
        }
        head = prev;
        
        return prev;
    }
}