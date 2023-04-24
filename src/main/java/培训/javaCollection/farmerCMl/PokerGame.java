package 培训.javaCollection.farmerCMl;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 准备牌
 * 洗牌
 * 发牌
 * 两种方式进行排序
 * ♦ ♣ ♠ ♥
 */
public class PokerGame {
  static ArrayList<String> arrayList = new ArrayList<>();
  
  static {
    String[] color = {"♦", "♣" , "♠", "♥"};
    String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
    for (String s : color) {
      for (String s1 : number) {
        arrayList.add(s + s1);
      }
    }
  arrayList.add("大王");
  arrayList.add("小王");
  }

  public PokerGame() {
    //洗牌
    Collections.shuffle(arrayList);

    //发牌
    ArrayList<String> player1 = new ArrayList<>();
    ArrayList<String> player2 = new ArrayList<>();
    ArrayList<String> player3 = new ArrayList<>();
    //地主底牌
    ArrayList<String> lord = new ArrayList<>();
    for (int i = 0; i < arrayList.size(); i++) {
      String poker = arrayList.get(i);
      if (i <= 2) {
        lord.add(poker);
      } else if (i % 3 == 0) {
        player1.add(poker);
      } else if (i % 3 == 1) {
        player2.add(poker);
      } else {
        player3.add(poker);
      }
    }



    //排序
    mySort(player1);
    mySort(player2);
    mySort(player3);
    System.out.println(player1);
    System.out.println(player2);
    System.out.println(player3);
  }

  public void mySort(ArrayList<String> list) {
    ArrayList<String> newList = new ArrayList<>();
    for (String s : list) {
      if (s.equals("♦3") || s.equals("♣3") || s.equals("♠3") || s.equals("♥3")) {
        newList.add(s);
      }
    }
    for (String s : list) {
      if (s.equals("♦4") || s.equals("♣4") || s.equals("♠4") || s.equals("♥4")) {
        newList.add(s);
      }
    }
    for (String s : list) {
      if (s.equals("♦5") || s.equals("♣5") || s.equals("♠5") || s.equals("♥5")) {
        newList.add(s);
      }
    }
    for (String s : list) {
      if (s.equals("♦6") || s.equals("♣6") || s.equals("♠6") || s.equals("♥6")) {
        newList.add(s);
      }
    }
    for (String s : list) {
      if (s.equals("♦7") || s.equals("♣7") || s.equals("♠7") || s.equals("♥7")) {
        newList.add(s);
      }
    }
    for (String s : list) {
      if (s.equals("♦8") || s.equals("♣8") || s.equals("♠8") || s.equals("♥8")) {
        newList.add(s);
      }
    }
    for (String s : list) {
      if (s.equals("♦9") || s.equals("♣9") || s.equals("♠9") || s.equals("♥9")) {
        newList.add(s);
      }
    }
    for (String s : list) {
      if (s.equals("♦10") || s.equals("♣10") || s.equals("♠10") || s.equals("♥10")) {
        newList.add(s);
      }
    }
    for (String s : list) {
      if (s.equals("♦J") || s.equals("♣J") || s.equals("♠J") || s.equals("♥J")) {
        newList.add(s);
      }
    }
    for (String s : list) {
      if (s.equals("♦Q") || s.equals("♣Q") || s.equals("♠Q") || s.equals("♥Q")) {
        newList.add(s);
      }
    }
    for (String s : list) {
      if (s.equals("♦K") || s.equals("♣K") || s.equals("♠K") || s.equals("♥K")) {
        newList.add(s);
      }
    }
    for (String s : list) {
      if (s.equals("♦A") || s.equals("♣A") || s.equals("♠A") || s.equals("♥A")) {
        newList.add(s);
      }
    }
    for (String s : list) {
      if (s.equals("♦2") || s.equals("♣2") || s.equals("♠2") || s.equals("♥2")) {
        newList.add(s);
      }
    }
    for (String s : list) {
      if (s.equals("大王")) {
        newList.add(s);
      }
    }
    for (String s : list) {
      if (s.equals("小王")) {
        newList.add(s);
      }
    }
    list.clear();
    list.addAll(newList);
  }

}
