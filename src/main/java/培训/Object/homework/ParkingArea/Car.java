package 培训.Object.homework.ParkingArea;

public class Car extends Vehicle {
  private static final int cost = 5;
  private String brand;

  public Car(String brand) {
    this.brand = brand;
  }

  @Override
  public int cost() {
    return cost;
  }
}
