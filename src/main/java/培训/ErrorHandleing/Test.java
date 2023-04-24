package 培训.ErrorHandleing;

public class Test {
  static void a() {
    try {
      b();
    } catch (ArrayIndexOutOfBoundsException e){
//      e.printStackTrace();
      System.out.println("out of bound exception");
      System.out.println(e.getMessage());
    } finally {
      System.out.println("end of the program");
    }
  }

  static void b() throws ArrayIndexOutOfBoundsException{
    int[] arr = {1, 2, 3, 4};
    arr[4] = 100;
    System.out.println(arr[4]);
  }
  public static int ma() {
    int b = 10;
    try {
      int n = 100;
      return n / b;
    } catch (Exception e) {
      return 10;
    } finally {
      return 100;
    }
  }

  public static void main(String[] args) throws BNNNEException {
//    System.out.println(ma());
//    int[] arr = {1, 2, 3, 4};
//    try {
//      arr[4] = 1;
//    } catch (ArrayIndexOutOfBoundsException e) {
//      System.out.println("out of bound");
//    }
//    Student student1 = new Student(60,70);
//    System.out.println(student1.avgScore());
//    Student student = new Student(20,50);
//    System.out.println(student.avgScore());

    Account a = new Account("a",768);
    a.pay(45.0);
    a.save(56);

  }
}
