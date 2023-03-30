package 培训.Object;

public class Laptop {
  private char color;
  private int cpu;

  public Laptop(char color, int cpu) {
    this.color = color;
    this.cpu = cpu;
  }

  public Laptop() {

  }

  public char getColor() {
    return color;
  }

  public void setColor(char color) {
    this.color = color;
  }

  public int getCpu() {
    return cpu;
  }

  public void setCpu(int cpu) {
    this.cpu = cpu;
  }



}
