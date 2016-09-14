/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
int GetNode(Node head,int n) {
    Node curr = head;
    Node res = head;
    int pos = 0;
    while(curr.next != null){
        if (pos >= n) {
            res = res.next;
        }
        pos++;
        curr = curr.next;
    }
    return res.data;
}
