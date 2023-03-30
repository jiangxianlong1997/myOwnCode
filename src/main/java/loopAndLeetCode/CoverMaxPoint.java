package loopAndLeetCode;

public class CoverMaxPoint {

  public static int calculateSum(int[] arr, int left, int right) {
    int sum = 0;
    for (int i = left; i < right; i++) {
      sum += arr[i];
    }
    return sum;
  }

  public static int maxPoint(int[] array, int L) {
    int left = 0;
    int right = 0;
    int maxPoint = 0;
    int length = array.length;
    while (left < length) {
      while ((right - left <= L) && right < length) {
        right++;

      }
      maxPoint = Math.max(maxPoint, calculateSum(array, ++left, right));
    }
    return maxPoint;

  }

  public static void main(String[] args) {
    int[] arr = {1, 3, 4, 5, 6, 7, 8, 10, 12, -5, 1};
    System.out.println(maxPoint(arr, 4));
  }
}
