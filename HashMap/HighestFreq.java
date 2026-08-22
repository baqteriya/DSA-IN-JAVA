import java.util.*;
public class HighestFreq {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,3,3,4};
        int k =2;
        int answer[]=topkFrequent(nums,k);
        System.out.println("Top"+k+" frequent elements ");
        for(int num:answer){
            System.out.print(num+" ");
        }
    }
    public static int[]topkFrequent(int[] nums,int k){
        HashMap<Integer,Integer>freq = new HashMap<>();
        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>>pq = new PriorityQueue<>((a,b)->a.getValue()-b.getValue());
        for(Map.Entry<Integer,Integer>entry:freq.entrySet()){
            pq.add(entry);
            if(pq.size()>k){
                pq.poll();
            }
    }
    int answer[] = new int[k];
    for(int i=0;i<k;i++){
        answer[i]=pq.poll().getKey();
    }
    return answer;
    }
    
}
