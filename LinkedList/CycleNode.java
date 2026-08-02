

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class CycleNode {
    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        ListNode second = new ListNode(20); 
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);
        // connecting the nodes
        head.next = second;
        second.next = third;
        third.next = fourth;
        // creating a cycle in the linked list
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow .next;
            fast = fast.next.next;
            if(slow == fast){
                System.out.println("true");
                return;
            }
        }
        System.out.println("false");
    }
    
}
