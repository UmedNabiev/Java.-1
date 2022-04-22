package HomeWorkAPP_UN2;

public class HomeWork_2 {

        public static void main(String[] args) {
            System.out.println("Задание 1 -> " + summ(10, 9));
            System.out.println("***************");

            numpositive_1(10);
            System.out.println("***************");

            System.out.println("Задание 3 -> " + numpositive_2(-30));
            System.out.println("***************");

            printString("Добрый день", 5);
            System.out.println("***************");

            int currentYear = 1986;
            System.out.println("Задание 5 -> " + "Year " + currentYear + " is leap year? " + isleapYear(currentYear));
            System.out.println("******-Done-******");
        }

// 1. Написать метод, принимающий на вход два целых числа и проверяющий,
// * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
// * в противном случае – false.
    public static boolean summ(int a, int b) {
           return ((a + b)>=10 && (a + b)<=20);
        }

// 2. Написать метод, которому в качестве параметра передается целое число,
// * метод должен напечатать в консоль, положительное ли число передали или отрицательное.
// * Замечание: ноль считаем положительным числом

    public static void numpositive_1(int variable) {
         if (variable >= 0) {
             System.out.println("Задание 2 -> " + variable + " is positive");
         } else {
             System.out.println("Задание 2 -> " + variable + " is negative");
         }
}
//* 3. Написать метод, которому в качестве параметра передается целое число.
// * Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

    public static boolean numpositive_2(int variable) {
        return variable <= 0;
    }

//  * 4. Написать метод, которому в качестве аргументов передается строка и число,
// * метод должен отпечатать в консоль указанную строку, указанное количество раз.

    public static void printString(String value, int count) {
        for (int i = 1; i <= count; i++) {
            System.out.println("Задание 4 -> " + "String #" + i + ": " + value);
        }
    }

//  5.* Написать метод, который определяет, является ли год високосным,
// * и возвращает boolean (високосный - true, не високосный - false).
// * Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

    public static boolean isleapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }
}
