package 培训.Basic;

public class SmartSMS {

  public static void printWelcome() {
    System.out.println("  welcome");
    System.out.println("        1: login");
    System.out.println("        2: exit");
    System.out.println("****************");
    System.out.print("please select: ");

  }

//  public static void login() {
//    String username = "abc";
//    String password = "123";
//    System.out.print("username: ");
//    Scanner nameSc = new Scanner(System.in);
//    String name = nameSc.next();
//    System.out.print("password: ");
//    Scanner pwSc = new Scanner(System.in);
//    String pw = pwSc.next();
//    if (name.equals(username) && pw.equals(password)) {
//      System.out.println("welcome " + username);
//      System.out.println("this is main menu");
//    } else {
//      System.out.println("Permitted denied, please login again");
//      printWelcome();
//      choose();
//    }
//  }

//  public static void choose() {
//    Scanner scanner = new Scanner(System.in);
//    String input = scanner.next();
//    if (input.equals("1")) {
//      login();
//    } else if (input.equals("2")) {
//      System.exit(0);
//    } else {
//      System.out.println("invalid input, please input again");
//      printWelcome();
//      choose();
//    }
//  }

//  public static void main(String[] args) {
//    printWelcome();
//    choose();
//  }

}
