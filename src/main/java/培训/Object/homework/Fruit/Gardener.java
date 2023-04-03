package 培训.Object.homework.Fruit;

import java.util.Scanner;

public class Gardener {
  public Fruit create() {
    System.out.print("input here: ");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.next();

    switch (input) {
      case "apple" -> {
        return new Apple();
      }

      case "pear" -> {
        return new Pear();
      }
      case "orange" -> {
        return new Oranges();
      }
    }
    System.out.println("invalid input");
    create();
    return null;
  }
  public static void main(String[] args) {
    Gardener gardener = new Gardener();
    gardener.create();
  }

}
