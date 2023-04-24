package 培训.javaCollection.HomeWork;

import java.util.ArrayList;

public class DataBase {
    ArrayList<User> list = new ArrayList<>();

    public ArrayList<User> getList() {
        return list;
    }

    public void setList(ArrayList<User> list) {
        this.list = list;
    }

    public void addUser(User user) {
        list.add(user);
    }

    public void deleteUser(User user) {
        list.remove(user);
    }

    public void changeUserPassword(User user, String password) {
        user.setPassword(password);
    }

    public void initDefaultDB() {
        list.add(new Admin("1","abc","123", "a@qq.com","admin"));
        list.add(new NormalUser("2","abcd","1234", "b@qq.com","normal"));
    }
}
