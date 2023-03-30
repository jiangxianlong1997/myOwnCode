package 培训;

public class Switch {

  public static void main(String[] args) {
    int week = 0;
    String name;
    switch (week) {
      case 0:
        name = "Sunday";
      case 1:
        name = "Monday";
      case 2:
        name = "Tuesday";
      case 3:
        name = "Wednesday";
      case 4:
        name = "Thursday";
      case 5:
        name = "Friday";
      default:
        name = "Saturday";
    }
    System.out.println("type number");
  }

}
