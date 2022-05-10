package HomeWork6;

import HomeWork6.Animals;
// 1. Создать классы Собака и Кот с наследованием от класса Животное.
public class Cat extends Animals {
    private static int count;

    public Cat(String type, String name, int maxRun, int maxSwim) {
        super(type, name, maxRun, maxSwim);
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        count++;
    }
        public static int getCount() {
            return count;
    }

    @Override
    public void swim(int dist) {
    if (this.maxSwim >= dist) System.out.println(this.type + " " + this.name + " проплыл(а) " + dist + " м.");
    else System.out.println(this.type + " " + this.name + " не умеет плавать");}
    
}
