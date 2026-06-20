package HashSet;

import java.util.HashSet;

public class AddNo {
    public static void main(String[] args) {
        HashSet <Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        int sum =0;
        for(int num : set){  
            sum = sum + num;
        
        System.out.println(sum);
    }
}
}
