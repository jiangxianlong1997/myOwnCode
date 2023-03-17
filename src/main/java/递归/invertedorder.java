package 递归;

public class invertedorder {

  public static void changeorder(int i) {
    System.out.print(i % 10);
    if (i > 10) {
      changeorder(i / 10);
    }
  }

  public static void main(String args[]) {
    changeorder(456789);
  }
}

