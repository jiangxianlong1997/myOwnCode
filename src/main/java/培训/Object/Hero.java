package 培训.Object;

public class Hero {
  private int[] position;

  private String name;

  private final int volume = 2;

  public Hero(int[] position, String name) {
    this.position = position;
    this.name = name;
  }

  public int[] getPosition() {
    return position;
  }

  public int getVolume() {
    return volume;
  }

  public int getXposition() {
    return position[0];
  }

  public int getYposition() {
    return position[1];
  }
}
