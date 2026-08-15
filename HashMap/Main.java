import java.util.*;

public class Main {

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] answer = twoSum(nums, target);

        System.out.println("Index: " + answer[0] + ", " + answer[1]);
    }

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int current = nums[i];
            int needed = target - current;

            if (map.containsKey(needed)) {
                return new int[]{map.get(needed), i};
            }

            map.put(current, i);
        }

        return new int[]{};
    }
}