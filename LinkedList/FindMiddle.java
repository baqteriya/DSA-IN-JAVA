

public class FindMiddle {
    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);
        ListNode fifth = new ListNode(50);
        ListNode sixth = new ListNode(60);
        ListNode seventh = new ListNode(70);
        // connecting the nodes
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        // finding the middle node
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle node value: " + slow.val);

        // ListNode temp = head;
        // while(temp != null){
        //     temp = temp.next;
        // }

    }
    
}
