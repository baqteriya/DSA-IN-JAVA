import java.util.LinkedList;
public class SumElement {
    public static void main(String[] args) {
        LinkedList<Integer>list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        int sum=0;
        for(int i=0;i<list.size();i++){
            sum = sum + list.get(i);
        }
        System.out.println(sum);
    }
}
