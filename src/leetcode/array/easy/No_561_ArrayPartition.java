package leetcode.array.easy;

import java.util.Arrays;

public class No_561_ArrayPartition {
    public int arrayPairSum(int[] nums) {
        int len = nums.length;
        int result = 0;
        Arrays.sort(nums);
        for (int i = 0; i < len; i += 2) {
            result += nums[i];
        }
        return result;
    }
}
