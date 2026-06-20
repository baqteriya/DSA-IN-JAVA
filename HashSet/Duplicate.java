import java.util.HashSet;
public class Duplicate {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,10,30};
        HashSet <Integer> set = new HashSet<>();
        int count =0;
        for(int num:arr){
           if(!set.add(num)){
            count++;
           }
        }
        System.out.println("Duplicate count:"+count);
    }
}
