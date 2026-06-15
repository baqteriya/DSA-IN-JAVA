import java.util.ArrayList;
public class Largest {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(70);
        int largest =list.get(0);
        for(int i=0;i<list.size();i++){
            if(list.get(i)>largest){
                largest = list.get(i);
            }
        }
            System.out.println(largest);


    }
    
}
