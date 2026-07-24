
class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}
class AddLast{
    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        // connecting the nodes
        head.next = second; 
        second.next = third;
        third.next = null;
        //add last
        ListNode newNode = new ListNode(40);
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        ListNode temp1 = head;
        while(temp1 != null){
            System.out.println(temp1.val);
            temp1 = temp1 .next;
        }
    }
}