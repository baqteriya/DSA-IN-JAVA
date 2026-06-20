
import java.util.LinkedList;

public class Largest {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        int largest = list.get(0);
        for(int i=0;i<list.size();i++){
            if(list.get(i)>largest){
                largest = list.get(i);
            }

        }
        System.out.println(largest);

    }
}
