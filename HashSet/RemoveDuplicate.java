import java.util.HashSet;
public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,1,2,5,6,7};
        HashSet <Integer> set = new HashSet<>();
        for(int num:arr){
            if(! set.add(num)){
                System.out.println(num);
            }
        }
    }
}
