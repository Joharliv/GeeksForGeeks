/*
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
    public int getNode(Node head, int k) {
        // code here
        if(k == 1) return head.data;
        int count = 1;
        Node temp = head;
        
        while(temp.next != null){
            temp = temp.next;
            count++;
            
            if(count == k){
                return temp.data;
            }
        }
        return -1;
    }
}