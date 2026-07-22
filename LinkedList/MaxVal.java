class ListNode{
    int val;
    ListNode next = null;
    ListNode(int val){
        this.val = val;
        this.next = null;

    }
}
class MaxVal{
    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        //connecting the nodes
        head.next = second;
        second.next = third;
        ListNode temp = head;
        int max = Integer.MIN_VALUE;
        while(temp != null){
            if(temp.val>max){
                max= temp.val;
            }
            temp=temp.next;
        }
        System.out.println("Maximum value in the linked list: " + max);
    }
}