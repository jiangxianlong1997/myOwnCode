package 培训.Object;

public class Main {

  public static void main(String[] args) {

    Dog new_dog = new Dog(1,10,"dog1",new int[]{0,0});
    Hero new_hero = new Hero(new int[]{2,0}, "A");
    Map map = new Map(new_hero ,new_dog);

    new_dog.call();
    new_dog.run();
    System.out.print("当前位置: ");
    System.out.print("x: " + new_dog.getXPosition());
    System.out.println(" y: " + new_dog.getYposition());
    System.out.println("狗的生命: " + new_dog.getHp());
    if (map.crash(new_hero, new_dog)) {
      map.damageDog();
    }
    new_dog.run();
    System.out.println("狗的生命: " + new_dog.getHp());
    if (map.crash(new_hero, new_dog)) {
      map.damageDog();
    }
    System.out.println("狗的生命: " + new_dog.getHp());
    new_dog.run();
    if (map.crash(new_hero, new_dog)) {
      map.damageDog();
    }
    System.out.println("狗的生命: " + new_dog.getHp());
    new_dog.run();
    if (map.crash(new_hero, new_dog)) {
      map.damageDog();
    }
    System.out.println("狗的生命: " + new_dog.getHp());
    new_dog.run();
    if (map.crash(new_hero, new_dog)) {
      map.damageDog();
    }
    System.out.println("狗的生命: " + new_dog.getHp());


  }

}
