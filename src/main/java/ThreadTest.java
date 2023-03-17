public class ThreadTest {

  public static void main(String[] args) throws InterruptedException {
    Thread thread1 = new Thread(new Thread2());
    thread1.setDaemon(true);
    thread1.start();
    Thread.sleep(10);
    System.out.println("用户线程退出");
    //没打出1+1=2因为
  }
}

class Thread2 implements Runnable {

  @Override
  public void run() {
    try {
      Thread.sleep(1000);
      System.out.println("1+1=" + (1 + 1));
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
