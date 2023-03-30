//给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
//
// 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
//
//
//
// 示例 1：
//
//
//输入：[3,2,3]
//输出：3
//
// 示例 2：
//
//
//输入：[2,2,1,1,1,2,2]
//输出：2
//
//
//
//
// 进阶：
//
//
// 尝试设计时间复杂度为 O(n)、空间复杂度为 O(1) 的算法解决此问题。
//
// Related Topics 位运算 数组 分治算法
// 👍 891 👎 0
package loopAndLeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode169_多数元素 {

  public static int majorityElement(int[] nums) {
    if (nums.length == 0) {
      return -1;
    }
    Map<Integer, Integer> map = new HashMap();
    for (int ele : nums) {
      if (map.containsKey(ele)) {
        map.put(ele, map.get(ele) + 1);
      } else {
        map.put(ele, 1);
      }
    }
    int max = Integer.MIN_VALUE;
    int result = Integer.MIN_VALUE;
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if (max < entry.getValue()) {
        max = entry.getValue();
        result = entry.getKey();
      }
    }
    return result;
  }

  //简单排序
  public static int Solution2(int[] nums) {
    Arrays.sort(nums);
    return nums[nums.length / 2];
  }

  //Boyer-Moore 摩尔投票算法
  public static int Solution3(int[] nums) {
    Arrays.sort(nums);
    return nums[nums.length / 2];
  }

  public static void main(String[] args) {
    int[] nums = {1, 2, 1};
    System.out.println(Solution2(nums));
  }
}
