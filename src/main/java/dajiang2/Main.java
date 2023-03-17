package dajiang2;

/*时间限制： 3000MS
    内存限制： 589824KB
    题目描述：
    给定一个 24 小时制（小时:分钟 "HH:MM"）的时间列表，找出列表中任意两个时间的最小时间差并以分钟数表示。



    输入描述
    timePoints = ["23:59","00:00"]

    注意【输入样例】中

    2  //第一行为timePoints数组长度

    23:59  //第二行至最后一行为数组每个元素

    00:00

    输出描述
    1

    样例输入
2
23:59
00:00
样例输出
1

提示
2 <= timePoints.length <= 2 * 104
 */

import java.util.Scanner;

class Solution {

    /* Write Code Here */
    public int findMinDifference(String[] timePoints) {
      for(int i = 0; i < timePoints.length; i++) {
        if(Double.parseDouble(timePoints[i]) > Double.parseDouble(timePoints[i+1])){

        }
      }
      return 0;

    }
  }

  public class Main {
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int res;

      int timePoints_size = 0;
      timePoints_size = in.nextInt();
      if (in.hasNextLine())
        in.nextLine();
      String[] timePoints = new String[timePoints_size];
      String timePoints_item;
      for(int timePoints_i = 0; timePoints_i < timePoints_size; timePoints_i++) {
        try {
          timePoints_item = in.nextLine();
        } catch (Exception e) {
          timePoints_item = null;
        }
        timePoints[timePoints_i] = timePoints_item;
      }

      res = new Solution().findMinDifference(timePoints);
      System.out.println(String.valueOf(res));

    }
  }

