package MyLeetCodeExersice;

import java.util.Arrays;

/**
    给你一个整数数组 nums ，你需要找出一个 连续子数组 ，如果对这个子数组进行升序排序，那么整个数组都会变为升序排序。
    请你找出符合题意的 最短 子数组，并输出它的长度。
    示例 1：
    输入：nums = [2,6,4,8,10,9,15]
    输出：5
    解释：你只需要对 [6, 4, 8, 10, 9] 进行升序排序，那么整个表都会变为升序排序。

    示例 2：
    输入：nums = [1,2,3,4]
    输出：0

    示例 3：
    输入：nums = [1]
    输出：0

    提示：
    1 <= nums.length <= 10⁴
    -10⁵ <= nums[i] <= 10⁵
    进阶：你可以设计一个时间复杂度为 O(n) 的解决方案吗？

    Related Topics 栈 贪心 数组 双指针 排序 单调栈 👍 1052 👎 0
 */

public class Q581 {

  /**
   * my solution 写的和脑瘫一样
   */
  public int findUnsortedSubarrayMyself(int[] nums) {
    if (nums.length == 0 || nums == null) return 0;
    int[] temp = new int[nums.length];
    System.arraycopy(nums, 0, temp, 0, nums.length);
    Arrays.sort(temp);
    int startIndex = 0;
    int endIndex = nums.length - 1;
    for (int i = 0; i < nums.length; i++) {
     if (nums[i] != temp[i]) {
       break;
     }
      startIndex ++;
    }
    for (int i = nums.length - 1; i > 0; i--) {
      if (nums[i] != temp[i]) {
        break;
      }
      endIndex --;
    }
    if (startIndex >= endIndex) {
      return 0;
    }
    return endIndex - startIndex + 1;
  }

  public int findUnsortedSubarray(int[] nums) {
    int start = -1, end = -2;
    int length = nums.length;
    if (nums == null || nums.length == 0) {
      return 0;
    }

    int max = nums[0], min = nums[length- 1];
    //一直记录到最后一个减的尾和增的头，再做减法运算+1
    for (int i = 0; i < length; i++) {
      max = Math.max(max, nums[i]);
      min = Math.min(min, nums[length - i - 1]);
      if (max > nums[i]) {
        end = i;
      }
      if (min < nums[length - i - 1]) {
        start = length - i - 1;
      }
    }
    return end - start + 1;
  }

  public static void main(String[] args) {
    Q581 q581 = new Q581();
    System.out.println(q581.findUnsortedSubarray(new int[]{2,1,3,5,4}));
  }
}
