import java.util.*;
class Stack{
    LinkedList<Character> list = new LinkedList<>();
    public boolean isValid(String s){
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                list.push(ch);
            }else{
                if(list.isEmpty()){
                    return false;
                }
                char top = list.peek();
                if(ch == ')' && top == '(' || ch == '}' && top == '{' || ch == ']' && top == '['){
                    list.pop();
                } else {
                    return false;
                }
            }
        }
        return list.isEmpty();
    }
}

public class Parentheses {
    public static void main(String[] args) {
        
    Stack s = new Stack();
        System.out.println(s.isValid("()"));       
        System.out.println(s.isValid("()[]{}"));   
        System.out.println(s.isValid("(]"));       
        System.out.println(s.isValid("([)]"));     
        System.out.println(s.isValid("{[]}"));  
    }
    
}
