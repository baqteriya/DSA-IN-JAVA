import java.util.ArrayList;
public class AddTwoElement {
   public static void main(String[] args) {
    ArrayList<Integer>list = new ArrayList<>();
    list.add(12);
    list.add(13);
    list.add(14);
    list.add(15);
    list.add(17);
    int sum =0;
    for(int i=0;i<list.size();i++){
        sum = sum + list.get(i) ;
    }
        System.out.println(sum);
    }
   }
    
