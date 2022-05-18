package HomeWork6;

import HomeWork6.Animals;
// 1. Создать классы Собака и Кот с наследованием от класса Животное.
public class Dog extends Animals{
    private static int count;

    public Dog(String type, String name, int maxRun, int maxSwim) {
        super(type, name, maxRun, maxSwim);
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        count++;
    }

    public static int getCount() {
        return count;
    }

}
