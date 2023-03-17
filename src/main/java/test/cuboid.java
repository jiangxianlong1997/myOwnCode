package test;

public class cuboid extends rectangle{
  private int height;


  public cuboid(int length, int width, int height) {
    super(length, width);
    this.height = height;
  }
  public int getVolume() {
    return this.getLength() * this.getWidth() * this.height;
  }
}
