package leetcode.medium;

/**
 * @Author: Liang
 * @Description: 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素最多出现两次，返回移除后
 * 数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * @Date: Created in 14:39 2019/3/29
 */
public class No_080 {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums) {
            if (i < 2 || n > nums[i - 2]) {
                nums[i++] = n;
            }
        }
        return i;
    }
}
