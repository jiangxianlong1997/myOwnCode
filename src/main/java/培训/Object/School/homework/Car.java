package 培训.Object.School.homework;

public class Car extends Vehicle {

  private final int loader;

  public Car(String brand, String color, int loader) {
    super(brand, color);
    this.loader = loader;
  }

  @Override
  public void run() {
    System.out.println("car run with loader: " + loader);
  }
}
