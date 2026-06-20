import java.util.LinkedList;
public class AddbeginningandLast {
    public static void main(String[] args) {
        LinkedList <Integer> list = new LinkedList<>();
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.addFirst(10);
        list.addLast(40);
        System.out.println(list);
    }
}
