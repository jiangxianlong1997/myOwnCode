package 培训.Object.homework.ParkingArea;

public class Bus extends Vehicle{
  private String brand;
  private static final int cost = 8;

  public Bus(String brand) {
    this.brand = brand;
  }

  @Override
  public int cost() {
    return cost;
  }
}
