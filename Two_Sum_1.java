import java.util.HashMap;
import java.util.Map;

public class Two_Sum_1 {
    public static void main(String[] args) {
//        int arr[] = {15, 11, 7, 2};
        int arr[] = {2, 7, 11, 15};
        for (int i : twoSum(arr, 9)) {
            System.out.println(i);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return new int[]{i, map.get(nums[i])};
            }
            map.put(target - nums[i], i);
        }
        return null;
    }
}