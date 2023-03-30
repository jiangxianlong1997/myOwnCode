package 培训.Object.homework;

public class Student {

  private String name;
  private int id;
  private int score;

  public Student(String name, int id, int score) {
    this.name = name;
    this.id = id;
    this.score = score;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getScore() {
    return score;
  }

}
