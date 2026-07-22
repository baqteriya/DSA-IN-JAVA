class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}
public class EvenOddCount {
    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        ListNode second = new ListNode(15);
        ListNode third = new ListNode(20);
        ListNode fourth = new ListNode(25);
        //connecting the nodes
        head.next = second;
        second.next = third;
        third.next = fourth;
        int evenCount = 0;
        int oddCount = 0;
        ListNode temp = head;
        while (temp != null) {

    if (temp.val % 2 == 0) {
        evenCount++;
    } else {
        oddCount++;
    }

    temp = temp.next;
}

System.out.println("Even = " + evenCount);
System.out.println("Odd = " + oddCount);
          
        }
    }
