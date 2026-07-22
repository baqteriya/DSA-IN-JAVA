class ListNode{
    int val;
    ListNode next = null;
    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}
class Main{
    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        //connecting the nodes
        head.next = second;
        second.next = third;
        ListNode temp = head;
        int sum =0;
        while(temp != null){
            sum += temp.val;
            temp=temp.next;
        }
        System.out.println("Sum of all nodes in the linked list: " + sum);
    }
}