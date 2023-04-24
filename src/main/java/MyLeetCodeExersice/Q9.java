package MyLeetCodeExersice;

public class Q9 {

  public static void main(String[] args) {
    Q9 q9 = new Q9();
    System.out.println(q9.isPalindrome_mySolution2(12321));

  }

  //my solution1, 时间复杂度，空间复杂度超级高的String_Buffer
  public boolean isPalindrome_mySolution1(int x) {
    StringBuilder stringBuffer_rev = new StringBuilder();
    stringBuffer_rev.append(x);
    stringBuffer_rev.reverse();
    return String.valueOf(x).contentEquals(stringBuffer_rev);
  }

  //my solution2, math
  public boolean isPalindrome_mySolution2(int x) {
    if (x < 0 || (x % 10 == 0 && x != 0)) {
      return false;
    }
    int reverse = 0;
    while (x > reverse) {
      reverse = x % 10 + reverse * 10;
      System.out.println(reverse);
      x /= 10;
    }

    return x == reverse || x == reverse / 10;
  }

}
