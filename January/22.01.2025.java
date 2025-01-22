
class Solution {
    static Node addTwoLists(Node num1, Node num2) {
        // code here
        Node ans = new Node(-1);
        Node temp = ans;
        Node head1 = reverse(num1);
        Node head2 = reverse(num2);
        int carry =0, rem=0, sum=0;
        while(head1!=null && head2!=null){
            sum = (head1.data + head2.data) + carry;
            rem = sum%10;
            carry = sum/10;
            temp.next = new Node(rem);
            temp = temp.next;
            head1 = head1.next;
            head2 = head2.next;
            
        }
        while(head1!=null){
            sum = (head1.data) + carry;
            rem = sum%10;
            carry = sum/10;
            temp.next = new Node(rem);
            temp = temp.next;
            head1 = head1.next;
        }
        while(head2!=null){
            sum = (head2.data) + carry;
            rem = sum%10;
            carry = sum/10;
            temp.next = new Node(rem);
            temp = temp.next;
            head2 = head2.next; 
        }
        while(carry != 0 ){
            sum = carry;
            rem = sum%10;
            carry = sum/10;
            temp.next = new Node(rem);
            temp = temp.next;
        }
        Node newHead =  reverse(ans.next);
        while(newHead!= null && newHead.data == 0){
            newHead = newHead.next;
        }
        return newHead == null ? new Node(0) : newHead;
    }
    
    static Node reverse (Node curr){
        Node i = curr;
        Node j = curr;
        Node temp = null;
        while(j!=null){
            j = j.next;
            i.next=temp;
            temp =i;
            i=j;
        }
        return temp;
    }
}
