import java.util.*;
public class Queue {
        LinkedList<Integer> list = new LinkedList<>();
        public void add(int data){
            list.add(data);
        }
        public int remove(){
            return list.remove(0);
        }
        public int peek(){
            return list.get(0);
        }
        public boolean isEmpty(){
            return list.isEmpty();
        }
        public int size(){
            return list.size();
        }
        public static void main(String[] args) {
            Queue q = new Queue();
            q.add(10);
            q.add(20);
            q.add(30);
            System.out.println(q.peek());
            System.out.println(q.remove());
            System.out.println(q.peek());
            System.out.println(q.isEmpty());
            System.out.println(q.size());
        }
    }
    

