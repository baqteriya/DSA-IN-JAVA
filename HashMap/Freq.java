import java.util.HashMap;
public class Freq {
    public static void main(String[] args) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int[] nums = {1, 2, 2, 3, 3, 3, 4};
        for(int num:nums){
            if(freq.containsKey(num)){
                freq.put(num,freq.get(num)+1);
            }else{
                freq.put(num,1);
            }
        }
        System.out.println(freq);
    }
}
