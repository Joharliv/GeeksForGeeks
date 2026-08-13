/* Structure of Linked List Node
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}
*/
class Solution {
    Node deleteNode(Node head, int x) {
        // code here
        if(head == null || head.next == null || x == 1){
            return head.next;
        }

        Node prev = null;
        Node temp = head;
        
        int count = 1;
        while(temp.next != null){
            prev = temp;
            temp = temp.next;
            count++;
            
            if(count == x){
                prev.next = temp.next;
                temp.next = null;
            }
        }
        return head;
    }
}