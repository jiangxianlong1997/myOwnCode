package 培训.Thread;

public class Test {

  public static void main(String[] args) {
//    Ticket ticket = new Ticket();
//    Thread thread1 = new Thread(ticket);
//    thread1.start();
//    Thread thread2 = new Thread(ticket);
//    thread2.start();

    Thread t2 = new Thread(new Son());
    Thread t1 = new Thread(new Mother(t2));

    t1.start();
    t2.start();
  }
}
