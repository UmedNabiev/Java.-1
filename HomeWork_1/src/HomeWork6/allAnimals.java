package HomeWork6;

import HomeWork6.Animals;

public class allAnimals {
    public static void main(String[] args) {
// 2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
// * Результатом выполнения действия будет печать в консоль. (Например, dog.run(150); -> 'Бобик пробежал 150 м.');
        Cat cat1 = new Cat("Сиамский кот", "по кличке Мурзик",200, 1);
        Cat cat2 = new Cat("Персидский кот", "по кличке Флаффи",250, 10);
        Dog dog1 = new Dog("Овчарка", "по кличке Рекс",500, 10);
        Dog dog2 = new Dog("Колли", "по кличке Лесси",600, 10);

        cat1.info();
        cat2.info();
        dog1.info();
        dog2.info();

        System.out.println();

      System.out.println("******************************");
// 3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
       dog1.run(500);
       dog1.swim(10);
       dog2.run(600);
       dog2.swim(10);

       cat1.run(200);
       cat1.swim(10);
       cat2.run(250);
       cat2.swim(10);

       System.out.println("******************************");
       System.out.println();
// 4.* Добавить подсчет созданных котов, собак и животных.
        System.out.println("Всего котов создано: " + Cat.getCount());
        System.out.println("Всего собак создано: " + Dog.getCount());
        System.out.println("Всего животных создано: " + Animals.getCount());
        System.out.println();

    }
}
