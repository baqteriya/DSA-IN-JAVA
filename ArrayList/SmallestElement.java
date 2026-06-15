import java.util.ArrayList;
public class SmallestElement {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(10);
        list.add(2);
        list.add(60);
        list.add(80);
        list.add(20);
        int smallest = list.get(0);
        for(int i=0;i<list.size();i++){
            if(list.get(i)<smallest){
                smallest = list.get(i);
            }

        }
        System.out.println(smallest);
    }
}
