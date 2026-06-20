import java.util.LinkedList;

public class Reverse {
    public static void main(String[] args) {
        LinkedList <Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        String reverse ="";
        for(int i=list.size()-1;i>=0;i--){
            reverse += list.get(i)+" ";
        }
    
    System.out.println(reverse);
    
}
}
