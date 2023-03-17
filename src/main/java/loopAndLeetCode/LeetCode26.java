package loopAndLeetCode;

public class LeetCode26 {
  public static int[] removeDuplicates(int[] nums) {
    if(nums.length == 0 || nums == null) return null;
    int p = 0;
    int q = 1;
    //int counter = nums.length;
    while (q < nums.length) {
      if (nums[p] != nums[q]) {
        nums[p + 1] = nums[q];
        p++;
      }
      q++;
    }
    return nums;
  }

  public static void main(String[] args) {
    int nums[] = {1, 2, 4, 4, 6, 6,6};
    for(int i : removeDuplicates(nums)){
      System.out.println(i);
    }


  }
}
