package 递归;

//2^n - 1
public class hannota {

  public static void hanoi(int n, char from, char tmp, char to) {
    if (n == 1) {
      System.out.println("take" + n + "from" + from + "to" + to);
    } else {
      hanoi(n - 1, from, to, tmp);
      System.out.println("take" + n + "from" + from + "to" + to);
      hanoi(n - 1, tmp, to, from);
    }
  }

  public static void main(String[] args) {
    hanoi(4, 'A', 'B', 'C');
  }

}
