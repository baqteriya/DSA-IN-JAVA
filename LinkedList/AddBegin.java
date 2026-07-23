class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}
class AddBegin{
    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);
        // connecting the nodes
        head.next = second;
        second.next = third;
        third.next = fourth;
        //add beginning
        ListNode newNode = new ListNode(5);
        newNode.next = head;
        head = newNode;
        ListNode temp = head;
        while(temp != null){
            System.out.println(temp.val);
            temp = temp.next;

        }
    }
}