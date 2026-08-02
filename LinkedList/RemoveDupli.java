class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class RemoveDupli {
    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        ListNode second = new ListNode(20); 
        ListNode third = new ListNode(20);
        ListNode fourth = new ListNode(30);
        // connecting the nodes
        head.next = second;
        second.next = third;
        third.next = fourth;
        ListNode temp = head;
        while(temp != null && temp.next != null){
            if(temp.val == temp.next.val){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
    }
    temp = head;
    while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}
       