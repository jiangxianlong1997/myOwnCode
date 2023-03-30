package 递归;

public class factorial {

  public static int factorial(int n) {
    if (n <= 1) {
      return 1;
    }
    return (n - 1) * n;
  }

  public static void main(String[] args) {
    System.out.println(factorial(4));
  }
}
