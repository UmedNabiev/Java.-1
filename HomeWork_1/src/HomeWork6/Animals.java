package HomeWork6;
// 1. Создать классы Собака и Кот с наследованием от класса Животное.
public abstract class Animals {
    protected String type;
    protected String name;
    protected int maxRun;
    protected int maxSwim;
    protected static int count;

    public Animals(String type, String name, int maxRun, int maxSwim) {
        this.type = type;
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        count++;
    }
    public void run(int dist) {
        if (this.maxRun >= dist) System.out.println(this.type + " " + this.name + " пробежал(а) " + dist + " м.");
        }

    public void swim(int dist) {
        if (this.maxSwim <= dist) System.out.println(this.type + " " + this.name + " проплыл(а) " + dist + " м.");
        else System.out.println(this.type + " " + this.name + " не умеет плавать");
    }

    public void info() {
        System.out.println(this.type + " " + this.name + " пробежал(а): " + this.maxRun + " м., проплыл(а): " + this.maxSwim + " м.");
    }

    public Animals() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}
