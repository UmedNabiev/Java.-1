package HomeWorkUN3;

public class HomeWork3 {
    public static void main(String[] args) {

//* 1. Создать массив, состоящий из элементов 0 и 1, например, [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//     С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] mass = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
        int maxMass = mass.length;
        for (int i = 0; i < maxMass; i++) {
            System.out.print(i + "-" + mass[i] + "|" + " ");
        }
        System.out.println("");
        for (int i = 0; i < maxMass; i++)
            if (mass[i] == 1) {
                mass[i] = 0;
            } else mass[i] = 1;
        for (int i = 0; i < maxMass; i++) {
            System.out.print(i + "-" + mass[i] + "|" + " ");
        }
        System.out.println();
        System.out.println("***************");

//* 2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
        int[] array = new int[100];
        int j = 1;
        int maxMass1 = array.length;
        for (int i = 0; i < maxMass1; i++) {
            System.out.print(i + "-" + array[i] + "|" + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < maxMass1; i++, j = j + 1) {
            array[i] = j;
        }
        for (int i = 0; i < maxMass1; i++) {
            System.out.print(i + "-" + array[i] + "|" + " ");
        }
        System.out.println();
        System.out.println("***************");

//* 3. Задать массив int[] mas = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
//     пройти по нему циклом, и числа, которые меньше 6, умножить на 2.
        int[] mas = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int maxMas3 = mas.length;
        for (int i = 0; i < maxMas3; i++) {
            if (mas[i] < 6) mas[i] = mas[i] * 2;
        }
        for (int i = 0; i < maxMas3; i++) {
            System.out.print(i + "-" + mas[i] + "|" + " ");
        }
        System.out.println();
        System.out.println("***************");

//* 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//     и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
//     Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
        int counter = 1;
        int[][] sqrArray = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int g = 0; g < 4; g++) {
                sqrArray[i][g] = (i == g || g == (4 - i - 1)) ? 1 : (int) (Math.random() * 100);
                System.out.printf("%4d" + "|", sqrArray[i][g]);
                counter++;
            }
            System.out.println();
        }
        System.out.println("***************");

//* 5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;

        int[] returnArrayFromMethod = returnArray(8, 48);
        printArray1("5. Array from method", returnArrayFromMethod);
        printArray1("5. Array from method", returnArray(8, 48));

        System.out.println("***************");

//  6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы
        int[] singlmas = {7, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 5};
        int min = singlmas[0], max = singlmas[0], i, imin = 0, imax = 0;
        for (i = 0; i != singlmas.length; i++) {
            if (singlmas[i] < min) {
                min = singlmas[i];
                imin = i;
            }
            if (singlmas[i] > max) {
                max = singlmas[i];
                imax = i;
            }
            System.out.println("max = " + max + " |" + " min = " + min);
            System.out.println("imax = " + imax + " |" + " imin = " + imin);
        }
        System.out.println("******-Done-******");

    }

// Вспомогательный метод для задания #5.
    public static void printArray1(String msg, int[] inputArray) {
        System.out.print(msg + ": ");
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + "|" + " ");
        }
        System.out.println();
        }

    public static int[] returnArray(int len, int initValue) {
        int[] tempArray = new int[len];

        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = initValue;
        }

        return tempArray;
    }
}
