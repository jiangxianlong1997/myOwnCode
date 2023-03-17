import java.util.Arrays;

public class copyofrange {

  public static void main(String[] args) {
    // TODO Auto-generated method stu
    int[] a = {3, 45, 32, 42, 34, 2, 1, 57, 4, 3, 56, 4, 65};
    int[] b = new int[8];
    b = Arrays.copyOfRange(a, 2, 10);
    System.out.print(Arrays.toString(b));

  }
}

