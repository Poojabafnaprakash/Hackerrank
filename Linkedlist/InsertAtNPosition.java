*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    

Node InsertNth(Node head, int data, int position) {
    Node curr = head;
    Node node;
    int i = 0;
    if(position == 0){
        node = new Node();
        node.data = data;
        node.next = curr;
        return node;
    }
    
    if(head == null){
        return null;
    }
    
    while(curr.next != null){
        i++;
        if(i == position)break;
        curr = curr.next;
    }
    node = new Node();
    node.data = data;
    node.next = curr.next;
    curr.next = node;
    return head;
    
}

