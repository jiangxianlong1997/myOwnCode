package 递归;

public class fullsort {

  public static void fullPermutation(char[] arr, int decision) {
    // 有效性判断
    if (arr == null || decision < 0 || decision > arr.length) {
      return;
    }
    //  如果现在要确定的位置已经超出了数组下标，说明现在已经生成了一种排列
    if (decision == arr.length) {
      System.out.println(new String(arr));
      return;
    }
    //  现在要确定的位置的元素可以是数组中从当前位置开始往后的任意元素
    for (int i = decision; i < arr.length; i++) {
      // 将选取的元素放入当前要确定的位置中
      {
        char t = arr[decision];
        arr[decision] = arr[i];
        arr[i] = t;
      }
      // 确定后继续确定下一个位置
      fullPermutation(arr, decision + 1);
      // 回溯
      {
        char t = arr[decision];
        arr[decision] = arr[i];
        arr[i] = t;
      }
    }
  }

  public static void main(String[] args) {
    char[] a = {'1', '2', '3'};
    fullPermutation(a, 0);
  }
}
