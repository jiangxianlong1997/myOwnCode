package 培训.javaCollection.HomeWork;

public class View {
    public static void main(String[] args) {
        DataBase db = new DataBase();
        db.initDefaultDB();
        Menu menu = new Menu(db);
        menu.systemMenu();
    }
}
