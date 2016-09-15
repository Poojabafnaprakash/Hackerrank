/*
Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node RemoveDuplicates(Node head) {
    if(head == null)
        return null;
    
    if(head.next == null)
        return head;
    
    Node prev = head;
    Node curr = head.next;
    
    while(curr.next != null)
    {  
        if(prev.data == curr.data){
            curr = curr.next;
            prev.next = curr;
        }
        else
        {
            prev = prev.next;
            curr = curr.next;
        }
    }
    if(curr.next == null && prev.data == curr.data)
        prev.next = curr.next;
    
    return head;
}

