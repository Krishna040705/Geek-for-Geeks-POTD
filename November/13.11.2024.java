class Intersect {
    // Function to find intersection point in Y shaped Linked Lists.
    int intersectPoint(Node head1, Node head2) {
        // code here
        int n=0, m=0;
        for(Node curr=head1;curr.next!=null;curr=curr.next)
            n++;
        for(Node curr=head2;curr.next!=null;curr=curr.next)
            m++;
        int diff = (n>m)?(n-m):(m-n);
        
        //traverse the diff times in larger linked list(ll)
        Node temp = (n>m)?head1:head2;
        while(diff>0 && temp!=null)
        {
            temp = temp.next;
            diff--;
        }
        
        // Now, temp is present at the same level node in larger ll
        Node y = (n>m)?head2:head1; //smaller ll head
        while(temp!=null && y!=null)
        {
            if(temp==y)
                return temp.data;
            temp = temp.next;
            y = y.next;
        }
        return -1;
    }
}
