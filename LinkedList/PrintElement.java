import java.util.LinkedList;
public class PrintElement {
    public static void main(String[] args) {
        LinkedList <Integer> list = new LinkedList<>();
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        for(int i=0;i<list.size();i++){
            System.out.println(list);
        }
    }
    
}
