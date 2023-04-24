package 培训.javaCollection.MapAndSet;

public class Box <T>{
    private T content;

    public Box(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public static void main(String[] args) {
        Box<String> box = new Box<>("a");
        System.out.println(box.getContent());

    }
}

