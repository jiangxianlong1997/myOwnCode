package 培训.Thread;

public class Mother implements Runnable{

  /**
   * final 修饰成员变量 确保thread是不可变的，保证其在线程中的安全性
   * 另外，final 修饰的成员变量必须在Constructor中初始化
   */
  private final Thread thread;

  public Mother(Thread thread) {
    this.thread = thread;
  }

  @Override
  public void run() {
    System.out.println("妈妈开始做饭");
    System.out.println("妈妈发现没酱油了");
    System.out.println("让儿子打酱油");

    try {
      thread.join();
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    System.out.println("妈妈继续做饭");
    System.out.println("妈妈做完饭了");
  }
}
