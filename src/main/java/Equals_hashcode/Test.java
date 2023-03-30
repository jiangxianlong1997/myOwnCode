package Equals_hashcode;

public class Test extends Thread {

  public static void main(String[] args) {

    Test test = new Test();
    test.run();
    System.out.println("main");
  }

  @Override
  public void run() {
    try {
      Thread.sleep(1000);
    } catch (Exception e) {

    }
    System.out.println("a");
  }
}
