class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}
public class InsertNodeMiddle {
    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(40);
        head.next = second;
        second.next = third;
        // inserting newNode in the middle
         ListNode newNode = new ListNode(30);
         ListNode temp = head;
         temp = temp.next;
         newNode.next = temp.next;
         temp.next = newNode;
         temp = head;
        
        while(temp != null){
            System.out.println(temp.val);
            temp = temp.next;
            }
        }
    }
