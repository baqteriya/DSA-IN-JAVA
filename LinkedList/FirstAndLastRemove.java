class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}

public class FirstAndLastRemove {
    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        // connecting the nodes
        head.next = second;
        second.next = third;
        third.next = null;
        // remove first
        head = head.next;
        // remove last
        ListNode temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
       while(temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }
     
    }
}