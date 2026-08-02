
class ListNode {
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
        this.next = null;

    }
}

public class ReverseList {
    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        ListNode second = new ListNode(20); 
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);
        // connecting the nodes
        head.next = second;
        second.next = third;
        third.next = fourth;
        // reversing the linked list
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            
        }
        head = prev;
        // printing the reversed linked list
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        
    }
}
