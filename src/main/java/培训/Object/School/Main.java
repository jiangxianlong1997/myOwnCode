package 培训.Object.School;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
//    Singleton.getInstance();
    ArrayList<Person> arrayList = new ArrayList<>();
    FootBallTeam footBallTeam = new FootBallTeam(arrayList);
    footBallTeam.addMember(new Person("1",1));
    footBallTeam.addMember(new Person("1",1));
    footBallTeam.addMember(new Person("1",1));
    footBallTeam.addMember(new Person("1",1));
    footBallTeam.addMember(new Person("1",1));
    footBallTeam.addMember(new Person("1",1));
    footBallTeam.addMember(new Person("1",1));
    footBallTeam.addMember(new Person("1",1));
    footBallTeam.addMember(new Person("2",1));
    footBallTeam.addMember(new Person("2",1));
    footBallTeam.addMember(new Person("2",1));
    footBallTeam.addMember(new Person("3",1));
    footBallTeam.addMember(new Person("3",1));
    footBallTeam.addMember(new Person("3",1));
    footBallTeam.addMember(new Person("3",1));
    footBallTeam.addMember(new Person("3",1));
    footBallTeam.addMember(new Person("3",1));
    footBallTeam.addMember(new Person("3",1));
    footBallTeam.forEach();

  }

}
