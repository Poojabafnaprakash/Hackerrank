/* deleteat a given position in a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

Node Delete(Node head, int position) {
    Node curr = head;
    int i;
    
    if(head == null){
        return null;
    }
    if(position == 0){
        head = head.next;
        return head;
    }
    
    else{
          for(i = 1;i<position;i++)
          curr = curr.next;
          curr.next = curr.next.next;
          return head;
    }
 

}


