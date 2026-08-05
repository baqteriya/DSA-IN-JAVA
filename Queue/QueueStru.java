public class QueueStru {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    Node tail;
    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public int remove(){
        if(head == null){
            System.out.println("queue is empty");
            return -1;
        }
        int front = head.data;
        if(head == tail){
            head = tail = null;
        } else {
            head = head.next;
        }
        return front;
    }
    public int peek(){
        if(head == null){
            System.out.println("queue is empty");
            return -1;
        }
        return head.data;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public static void main(String[] args) {
        QueueStru q = new QueueStru();
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
    }
    
}
