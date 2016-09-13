/*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not. 
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int CompareLists(Node headA, Node headB) {
    Node currA = headA;
    Node currB = headB;
    int test = 0;
            while (currA != null && currB != null){
                if(currA.data != currB.data){
                    test = 0;
                    return test;
                }
            currA = currA.next;
            currB = currB.next;
        }
    if(currA == null && currB == null) {
        test = 1;
    }
    
  return test;
}

