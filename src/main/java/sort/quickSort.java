package sort;

public class quickSort {

  public static void sort(int[] array, int low, int high) {
    if (low > high) {
      return;
    }
    int i, j, temp, t;
    i = low;
    j = high;
    temp = array[low];
    while (j > i) {

      while (temp <= array[j] && j > i) {
        j--;
      }
      while (temp >= array[i] && j > i) {
        i++;
      }
      if (j > i) {
        t = array[i];
        array[i] = array[j];
        array[j] = t;
      }
    }
    array[low] = array[i];
    array[i] = temp;
    sort(array, low, j - 1);
    sort(array, j + 1, high);
  }

  public static void main(String[] args) {
    int[] a = {6, 5, 2, 1, 8, 11, 0, 45, 23};
    sort(a, 0, a.length - 1);
    for (int i : a) {
      System.out.println(i);
    }
  }
}

