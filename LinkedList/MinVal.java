class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}
public class MinVal {
    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(5);
        //connecting the nodes
        head.next = second;
        second.next = third;
        third.next = fourth;
        ListNode temp = head;
        int min = Integer.MAX_VALUE;
        while(temp != null){
            if(temp.val<min){
                min= temp.val;
            }
            temp=temp.next;
        }
        System.out.println("Minimum value in the linked list: " + min);
        
    }
}
