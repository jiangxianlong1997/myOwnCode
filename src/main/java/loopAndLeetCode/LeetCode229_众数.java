//给定一个大小为 n 的整数数组，找出其中所有出现超过 ⌊ n/3 ⌋ 次的元素。
//
// 进阶：尝试设计时间复杂度为 O(n)、空间复杂度为 O(1)的算法解决此问题。
//
//
//
// 示例 1：
//
//
//输入：[3,2,3]
//输出：[3]
//
// 示例 2：
//
//
//输入：nums = [1]
//输出：[1]
//
//
// 示例 3：
//
//
//输入：[1,1,1,3,3,2,2,2]
//输出：[1,2]
//
//
//
// 提示：
//
//
// 1 <= nums.length <= 5 * 104
// -109 <= nums[i] <= 109
//
// Related Topics 数组
// 👍 339 👎 0

package loopAndLeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class LeetCode229_众数 {

  //真正的众数
  public static List<Integer> majorityElement(int[] nums) {
    if (nums.length == 0) {
      return null;
    }
    Map<Integer, Integer> map = new HashMap<>();
    for (int ele : nums) {
      if (map.containsKey(ele)) {
        map.put(ele, map.get(ele) + 1);
      } else {
        map.put(ele, 1);
      }
    }

    int max = Integer.MIN_VALUE;
    List<Integer> list = new ArrayList<>();
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if (max < entry.getValue()) {
        max = entry.getValue();
      }
    }
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if (max == entry.getValue()) {
        list.add(entry.getKey());
      }
    }

    return list;
  }

  //
  public static void main(String[] args) {
    int[] nums = {1, 2, 3};
    System.out.println(majorityElement(nums));
  }

  //题目中的众数（自己写的）
  public List<Integer> solution(int[] nums) {
    if (nums.length == 0) {
      return null;
    }
    Map<Integer, Integer> map = new HashMap<>();
    for (int ele : nums) {
      if (map.containsKey(ele)) {
        map.put(ele, map.get(ele) + 1);
      } else {
        map.put(ele, 1);
      }
    }

    List<Integer> list = new ArrayList<>();
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if (nums.length / 3 < entry.getValue()) {
        list.add(entry.getKey());
      }
    }

    return list;
  }

}
