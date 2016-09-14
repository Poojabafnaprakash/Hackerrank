/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node MergeLists(Node headA, Node headB) {
     if(headA == null && headB !=null)
         return headB;
    else if(headA != null && headB == null)
        return headA;
        else if(headA == null && headB ==null)
        return null;
        else {
        Node result;
        if(headA.data <= headB.data){
            result = headA;
            headA.next = MergeLists(headA.next,headB);
        }
        else {
            result = headB;
            headB.next = MergeLists(headA,headB.next);
        }
        return result;

    }
    

}
