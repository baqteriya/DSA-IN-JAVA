import java.util.Stack;
class MyQueue{
    Stack<Integer>s1;
    Stack<Integer>s2;
    MyQueue(){
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    //push element
public void push(int x){
    s1.push(x);
}
//pop element
public int pop(){
    if(s2.isEmpty()){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
    }
    return s2.pop();
}
//peek element
public int peek(){
    if(s2.isEmpty()){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
    }
        return s2.peek();

    }
    public boolean isEmpty(){
        return s1.isEmpty() && s2.isEmpty();
    }
public static void main(String args[]){
    MyQueue q = new MyQueue();
    q.push(10);
    q.push(20);
    q.push(30);
    System.out.println(q.peek());
    System.out.println(q.pop());
    System.out.println(q.isEmpty());

}
}