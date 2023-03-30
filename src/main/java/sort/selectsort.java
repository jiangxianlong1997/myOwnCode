package sort;

public class selectsort {

  public static int[] selectionsort(int[] array) {
    if (array.length == 0) {
      return array;
    }
    for (int i = 0; i < array.length; i++) {
      int minindex = i;
      for (int j = i; j < array.length; j++) {
        if (array[j] < array[minindex]) {
          minindex = j;
        }
      }
      int temp = array[minindex];
      array[minindex] = array[i];
      array[i] = temp;
    }
    return array;
  }

  public static void main(String[] args) {
    int[] a = {6, 5, 2, 1, 8, 0};
    selectionsort(a);
    for (int i : a) {
      System.out.println(i);
    }
  }
}
