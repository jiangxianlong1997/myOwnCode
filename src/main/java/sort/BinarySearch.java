package sort;

public class BinarySearch {

  //ER fen cha zhaoFro m A
  public static int binarySearch(int i, int[] array) {
    int min = 0;
    int max = array.length - 1;
    while (max >= min) {
      int middle = (min + max) / 2;
      if (array[middle] > i) {
        max = middle - 1;
      } else if (array[middle] < i) {
        min = middle + 1;
      } else {
        return middle;
      }

    }
    return -1;

  }

  public static void main(String[] args) {
    int[] arr = {2, 5, 6, 3, 6};
    System.out.println(binarySearch(6, arr));

  }
}
