import java.util.*;
public class MyStack {
    Queue<Integer>q1;
    Queue<Integer>q2;
    public MyStack(){
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    public void push(int x){
        q2.add(x);
        while(!q1.isEmpty()){
            q2.add(q1.remove());
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }
    public int pop(){
        return q1.remove();
    }
    public int top(){
        return q1.peek();
    }
    public boolean empty(){
        return q1.isEmpty();
    }
    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.top());
        System.out.println(s.pop());
        System.out.println(s.empty());
    }
}
