/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    int getMiddle(Node head) {
        // code here
        Node slow = head;
        Node fast = head;
        Node temp = head;
        int count = 1;
        while(temp.next != null){
            temp = temp.next;
            count++;
        }
        
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return (count % 2 == 0) ? slow.next.data : slow.data;
    }
}