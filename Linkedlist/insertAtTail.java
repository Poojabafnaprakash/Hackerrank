/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node Insert(Node head,int data) {
    Node node;
    Node curr = head;
    if(head == null){
        node = new Node();
        node.data = data;
        node.next = null;
        return node;
    }
    else {
        node = new Node();
        while(curr.next != null){
            curr = curr.next;
        } 
        curr.next = node;
        node.next = null;
        node.data = data;
        return head;
    }

  
}
