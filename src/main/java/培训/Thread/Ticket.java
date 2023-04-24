package 培训.Thread;

public class Ticket implements Runnable{
  private int num = 100;

  @Override
  public void run() {
    Object lock = new Object();
    while (num >= 1) {
      try {
        Thread.sleep(1);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
//      synchronized (lock) {
//        System.out.println(Thread.currentThread().getName() + " " + num);
//        num--;
//      }
      pay();
    }
  }

  private synchronized void pay() {
    if (num >= 1) {
      System.out.println(Thread.currentThread().getName() + " " + num);
    }
    num--;
  }
}
