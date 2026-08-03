import java.util.Stack;
class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack; 
    public MinStack(){
        stack = new Stack<>();
        minStack = new Stack<>();
    }   
    public void push(int val){
        stack.push(val);
        if(minStack.isEmpty()){
            minStack.push(val);
        }else{
            minStack.push(Math.min(val, minStack.peek()));
        }
    }
    public void pop(){
        stack.pop();
        minStack.pop();
    }
    public int top(){
        return stack.peek();
    }
    public int getMin(){
        return minStack.peek();
    }
    public static void main(String[] args) {
        MinStack s = new MinStack();
        s.push(5);
        s.push(2);
        s.push(8);
        System.out.println(s.getMin());
        s.pop();
        System.out.println(s.top());    
        System.out.println(s.getMin()); 
    }
    
}
