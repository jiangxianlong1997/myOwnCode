package 培训.Object.homework.ParkingArea;

import java.util.ArrayList;

public class ParkingArea {
  ArrayList<Vehicle> list = new ArrayList<>();

  public int totalCost(){
    int sum = 0;
    for (Vehicle vehicle: list
    ) {
      sum += vehicle.cost();
    }
    return sum;
  }

  public static void main(String[] args) {
    ParkingArea parkingArea = new ParkingArea();
    parkingArea.list.add(new Car("a"));
    parkingArea.list.add(new Car("b"));
    parkingArea.list.add(new Bus("a"));
    parkingArea.list.add(new Truck("a"));
    parkingArea.list.add(new Truck("b"));
    System.out.println(parkingArea.totalCost());
  }

}
