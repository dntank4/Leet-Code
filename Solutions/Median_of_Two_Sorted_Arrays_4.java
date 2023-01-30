package Solutions;

import java.util.Arrays;

public class Median_of_Two_Sorted_Arrays_4 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 7};
        int[] nums2 = {4, 5, 8, 11, 12};
        System.out.print(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int fal = nums1.length;
        int sal = nums2.length;
        int[] nums = new int[fal + sal];
        System.arraycopy(nums1, 0, nums, 0, fal);
        System.arraycopy(nums2, 0, nums, fal, sal);
        Arrays.sort(nums);
        if (nums.length % 2 == 0) {
            return (nums[nums.length / 2] + nums[(nums.length / 2 - 1)]) / 2.0;
        } else {
            return nums[nums.length / 2];
        }
    }
}