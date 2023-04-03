package 培训.Object;

public class Dog {
  private int age;
  private int hp;
  private String name;
  private int[] position;

  private final int volume = 1;

  public Dog(int age, int hp, String name, int[] position) {
    this.age = age;
    this.hp = hp;
    this.name = name;
    this.position = position;
  }

  public void call() {
    System.out.println("wolf");
  }

  public void run() {
    this.position[0] += 1;
  }

  public int getXPosition() {
    return position[0];
  }

  public int getYposition() {
    return position[1];
  }

  public int getVolume() {
    return volume;
  }

  public int getHp() {
    return hp;
  }

  public void setHp(int hp) {
    this.hp = hp;
  }
}
