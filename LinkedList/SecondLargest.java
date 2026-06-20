
import java.util.LinkedList;

public class SecondLargest {
    public static void main(String[] args) {
        LinkedList <Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int largest = list.get(0);
        int secondLargest = list.get(0);
        for(int i=0; i < list.size(); i++){
            if(list.get(i)>largest){
            secondLargest = largest;
            largest = list.get(i);
        }
        else if(list.get(i) != largest && secondLargest < list.get(i)){
            secondLargest = largest;

        }
    }
    System.out.println(secondLargest);
}
    
}
