Node RemoveDuplicates(Node head) {
    if(head == null && head.next == null)
        return head;
    
    Node prev = head;
    Node curr = head.next;
    
    while(prev.next != null)
    {  
        if(prev.data == prev.next.data){
            prev.next = prev.next.next;
        }
        else
        {
            prev = prev.next;
        }
    }
    return head;
}
