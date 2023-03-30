package 培训.Object.School;

public class Player{
    private static int num;
    private Player(){
      System.out.println("创建了一个球员");
    }
    public static Player getInstance(){
      if(num < 11){
        num++;
        return new Player();
      }else{
        System.out.println("已经创建了11个球员，无法继续创建！");
        return null;
      }
    }

  public static void main(String[] args) {
    for (int i = 0; i < 12; i++) {
      getInstance();
    }
  }
}
