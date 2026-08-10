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
    public Node insertPos(Node head, int pos, int val) {
        // code here
        Node newNode = new Node(val);
        
        if(head ==  null){
            head = newNode;
           return head;
        }
        if(pos == 1){
            newNode.next = head;
            head = newNode;
            return head;
        }
        
        
       Node prev = null;    
       Node temp = head;
       int count = 1;
       
       while(temp.next != null){
           prev = temp;
           temp = temp.next;
           count++;
           
           if(count == pos){
               newNode.next = prev.next;
               prev.next = newNode;
           }
       }
       
       if(temp.next == null && count + 1 == pos){
           temp.next = newNode;
       }
       
       return head;
    }
}