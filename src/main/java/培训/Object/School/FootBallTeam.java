package 培训.Object.School;

import java.util.ArrayList;

public class FootBallTeam {
  private static int num = 0;
  private ArrayList<Person> team = new ArrayList<>();

  public FootBallTeam(ArrayList<Person> team) {
    this.team = team;
  }

//  private static FootBallTeam instance = new FootBallTeam(new ArrayList<>());

  public ArrayList<Person> addMember(Person person) {
    int max_num = 11;
    if (num <= max_num) {
      num++;
      team.add(person);
      return team;
    }
    System.out.println("Out of bound, stop adding");
    return team;
  }

  public void forEach() {
    for (Person p : team
    ) {
      System.out.println(p.getName());
    }
  }
//  private static FootBallTeam getInstance() {
//    return instance;
//  }


}
