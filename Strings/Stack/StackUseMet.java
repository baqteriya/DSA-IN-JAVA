import java.util.*;
class Stack{
    LinkedList<Integer> list = new LinkedList<>();
    // push
    public void push(int data){
        list.push(data);
    }
    // pop
    public int pop(){
        return list.remove(list.size()-1);
    }
    //peek
    public int peek(){
        return list.get(list.size()-1);
    }
    // isEmpty
    public boolean isEmpty(){
        return list.isEmpty();
    }
    // size
    public int size(){
        return list.size();
    }
}
public class StackUseMet {
      public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20); 
        stack.push(30);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.size());
    
      } 
}
