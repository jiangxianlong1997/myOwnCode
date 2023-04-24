package algorithm.左神.Sort;

public class SelectionSort {

  /**
   * 时间复杂度 O(N^2) 空间复杂度O(1) : 空间分配了i，j，minIndex 三个变量 所以为O(1)
   * 看空间复杂度和看时间复杂度是不同的，以选择排序为例，虽然使用了数组但是这个数组的内存空间是被提前分配好的，
   * 所以空间复杂度是计算 i, j, minIndex 分配的内存 为O(1)
   * @param arr 要排序的数组
   */
  public static void selectionSort(int[] arr) {
    if (arr == null || arr.length < 2) {
      return;
    }
    for (int i = 0; i < arr.length - 1; i++) { //i ~ n-1 防止out of bound
      int minIndex = i;
      for (int j = i + 1; j < arr.length; j++) {
        minIndex = arr[j] < arr[minIndex] ? j : minIndex; //交换最小下标
      }
      swap(minIndex, i, arr);
    }
  }

  public static void swap(int a, int b, int[] arr) {
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
  }

  public static void main(String[] args) {
    int[] arr = new int[]{1, 3, 2, 5, 4};
    selectionSort(arr);
    for (int i : arr) {
      System.out.println(i);
    }
  }

}
