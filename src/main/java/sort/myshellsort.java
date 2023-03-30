package sort;

public class myshellsort {

  public static int[] sort(int[] array) {
    int temp;
    int step = array.length / 2;
    while (step > 0) {
      for (int i = step; i < array.length; i++) {
        temp = array[i];
        int preindex = i - step;
        while (preindex >= 0 && array[preindex] > array[preindex + step]) {
          array[preindex + step] = array[preindex];
          preindex -= step;
        }
        array[preindex + step] = temp;
      }
      step /= 2;
    }
    return array;
  }

  public static void main(String[] args) {
    int[] a = {6, 5, 2, 1, 8, 11, 0, 45, 23};
    sort(a);
    for (int i : a) {
      System.out.println(i);
    }
  }
}
