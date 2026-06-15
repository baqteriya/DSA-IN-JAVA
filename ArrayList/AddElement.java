import java.util.ArrayList;
public class AddElement {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add(9);
        list.add(8);
        list.add(7);
        list.add(0,1);
        list.add(4,10);
        System.out.println(list);

    }
}
