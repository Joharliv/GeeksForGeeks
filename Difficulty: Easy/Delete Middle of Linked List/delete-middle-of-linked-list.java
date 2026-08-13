/* Node Structure
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public Node deleteMid(Node head) {
        
        if(head == null || head.next == null) return null;
        // code here
        Node prev = null;
        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        prev.next = slow.next;
        slow.next = null;
        
        return head;
    }
}