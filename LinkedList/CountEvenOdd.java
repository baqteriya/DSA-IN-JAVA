
import java.util.LinkedList;

public class CountEvenOdd {
    public static void main(String[] args) {
        LinkedList <Integer> list = new LinkedList<>();
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        for(int i=0;i<list.size(); i++){
            if(list.get(i)%2 == 0){
                System.out.println("even");
            }else{
                System.out.println("odd");
            }
        }
    }
}
