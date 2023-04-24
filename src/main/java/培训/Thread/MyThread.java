package 培训.Thread;

public class MyThread implements Runnable{

  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println(Thread.currentThread().getName() + ": " + i);
    }
  }

  public static void main(String[] args) throws InterruptedException {
//    MyThread myThread = new MyThread();
//    myThread.start(); //启动线程
    Thread thread2 = new Thread(new MyThread2());
    thread2.start();
    System.out.println(thread2.getState());
    for (int i = 0; i < 10; i++) {
      Thread.sleep(1);
      System.out.println(Thread.currentThread().getName() + ": " + i);;
    }
  }
}
class MyThread2 implements Runnable {
  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println(Thread.currentThread().getName() + ": " + i);
    }
  }
}