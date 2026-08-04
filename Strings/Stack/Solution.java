import java.util.Stack;
public class Solution {
    public int calPoints(String[] operations){
        Stack<Integer> stack = new Stack<>();
        for(String op : operations){
            if(op.equals("+")){
                int first = stack.pop();
                int second = stack.peek();
                stack.push(first);
                stack.push(first + second);
                
            }else if(op.equals("D")){
                stack.push( 2 * stack.peek());
            }else if(op.equals("C")){
                stack.pop();
            }else{
                int num = Integer.parseInt(op);
                stack.push(num);
            }

        }
        int sum = 0;
        for(int n : stack){
            sum += n;
        }
        return sum;
       }

    public static void main(String[] args) {

        Solution obj = new Solution();

        String[] operations = {"5", "2", "C", "D", "+"};

        System.out.println(obj.calPoints(operations));
    }
}