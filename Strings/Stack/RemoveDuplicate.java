import java.util.*;
class Stack{
    LinkedList<Character> list = new LinkedList<>();
    public String removeDuplicates(String s){
        for(int i = 0; i < s.length();i++){
            char ch = s.charAt(i);
            if(list.isEmpty()){
                list.push(ch);
            }else if(list.peek() == ch){
                list.pop();
            }else{
                list.push(ch);
            }
        }
       StringBuilder ans = new StringBuilder();

        while (!list.isEmpty()) {
            ans.append(list.pop());
        }

        return ans.reverse().toString();
    }
}
public class RemoveDuplicate {
    public static void main(String[] args) {
        Stack s = new Stack();
         System.out.println(s.removeDuplicates("abbaca"));

    }
}
