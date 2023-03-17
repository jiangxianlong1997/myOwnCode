package dajiang;
/*
时间限制： 3000MS
内存限制： 589824KB
题目描述：
给你一个由 n 个正整数组成的数组 nums 。

你可以对数组的任意元素执行任意次数的两类操作：

1、如果元素是 偶数 ，除以 2

    例如，如果数组是 [1,2,3,4] ，那么你可以对最后一个元素执行此操作，使其变成 [1,2,3,2]

2、如果元素是 奇数 ，乘上 2

    例如，如果数组是 [1,2,3,4] ，那么你可以对第一个元素执行此操作，使其变成 [2,2,3,4]

数组的 偏移量 是数组中任意两个元素之间的 最大差值 。

返回数组在执行某些操作之后可以拥有的 最小偏移量 。

输入描述
nums = [1,2,3,4]



在【输入样例】中的数据结构

4 //第一行为数组nums的长度

1  //第二行至最后行为数组元素

2

3

4

输出描述
1

解释：你可以将数组转换为 [1,2,3,2]，再转换成 [2,2,3,2]，偏移量是 3 - 2 = 1


样例输入
4
1
2
3
4
样例输出
1

提示
n == nums.length

2 <= n <= 5 * 10^4

1 <= nums[i] <= 10^9
 */
import java.util.*;

class Solution {

  /* Write Code Here */
  public int minimumDeviation(int[] nums) {
     return 0;

  }
}

public class Main {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int res;

    int nums_size = 0;
    nums_size = in.nextInt();
    int[] nums = new int[nums_size];
    for(int nums_i = 0; nums_i < nums_size; nums_i++) {
      nums[nums_i] = in.nextInt();
    }

    if(in.hasNextLine()) {
      in.nextLine();
    }

    res = new dajiang.Solution().minimumDeviation(nums);
    System.out.println(String.valueOf(res));

  }
}

