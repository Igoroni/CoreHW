package Module4.Webinar_lesson;

public abstract class Animal {

    private String name;

    private int x;

    private int y;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    public abstract String voice();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
