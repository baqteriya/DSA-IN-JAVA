
import java.util.ArrayList;

public class SecondLargest {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(9);
        list.add(8);
        list.add(4);
        list.add(11);
        list.add(33);
        int largest = list.get(0);
        int secondLargest = list.get(0);
        for(int i=0;i<list.size();i++){
            if(list.get(i)>largest){
                 secondLargest = largest;
                largest = list.get(i);
            }else if(largest != list.get(i) && list.get(i) > secondLargest ){
                 secondLargest = largest;
            }

        }
        System.out.println(secondLargest);

    }
    
}
