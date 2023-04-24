package 培训.Thread;

public class Son implements Runnable{

  @Override
  public void run() {
    System.out.println("打酱油");
    for (int i = 0; i < 10; i++) {
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
      System.out.println("打了" + (i + 1) + "分钟");
    }
  }
}
