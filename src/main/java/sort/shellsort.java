package sort;

public class shellsort {

  public static int[] ShellSort(int[] array) {
    int len = array.length;
    int temp;
    int gap = len / 2;
    while (gap > 0) {
      for (int i = gap; i < len; i++) {
        temp = array[i];
        int preIndex = i - gap;
        while (preIndex >= 0 && array[preIndex] > temp) {
          array[preIndex + gap] = array[preIndex];
          preIndex -= gap;
          //System.out.println(preIndex);
        }

        array[preIndex + gap] = temp;
      }
      gap /= 2;
    }
    return array;
  }

  public static void main(String args[]) {
    int[] a = {6, 5, 2, 1, 8, 11, 0, 45, 23};
    ShellSort(a);
    for (int i : a) {
      System.out.println(i);
    }
  }
}
