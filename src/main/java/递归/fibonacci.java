package 递归;

public class fibonacci {

  public static int getfibo(int input) {
    if (input == 0) {
      return 0;
    }
    if (input == 1) {
      return 1;
    }
    return getfibo(input - 1) + getfibo(input - 2);
  }

  public static void main(String[] args) {
    System.out.println(getfibo(5));
  }
}
    
