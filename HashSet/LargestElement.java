import java.util.HashSet;
public class LargestElement {
    public static void main(String[] args) {
        int arr[] = {12,33,66,22,77,88};
        HashSet <Integer> set = new HashSet<>();
        int largest = 0;
        for(int num:arr){
            if(num>largest){
                largest = num;
            }
        }
    
        System.out.println(largest);

    }
}
