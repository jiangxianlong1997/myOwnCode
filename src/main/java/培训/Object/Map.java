package 培训.Object;

public class Map {
  private Hero hero;
  private Dog dog;

  public Map(Hero hero, Dog dog) {
    this.hero = hero;
    this.dog = dog;
  }

  /**
   * in this map any entities are square
   */


  public boolean crash(Hero hero, Dog dog) {
    return hero.getXposition() <= (dog.getXposition() + dog.getVolume())
        && (hero.getXposition() + hero.getVolume()) >= dog.getXposition()
        && (hero.getYposition() + hero.getVolume()) >= dog.getYposition()
        && hero.getYposition() <= (dog.getYposition() + dog.getVolume());
  }

  public void damageDog() {
    if (this.dog.getHp() <= 0) {
      System.out.println("dog dead");
      System.gc();
      return;
    }
    this.dog.setHp(this.dog.getHp() - 5);
  }


}
