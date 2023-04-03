package 培训.Object.homework.ParkingArea;

public class Truck extends Vehicle{

  private static final int cost = 10;
  private String brand;

  public Truck(String brand) {
    this.brand = brand;
  }

  @Override
  public int cost() {
    return cost;
  }
}
