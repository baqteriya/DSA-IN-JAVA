
import java.util.LinkedList;

public class Smallest {
    public static void main(String[] args) {
        LinkedList<Integer>list = new LinkedList<>();
        list.add(12);
        list.add(13);
        list.add(10);
        list.add(15);
        int smallest = list.get(0);
        for(int i=0;i<list.size();i++){
            if(list.get(i)<smallest){
                smallest = list.get(i);
            }
        }
        System.out.println(smallest);
    }
}
