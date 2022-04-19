package HomeWorkAPP_UN2;

public class HomeWork_2 {

        public static void main(String[] args) {
            System.out.println("«адание 1 -> " + summ(10, 9));
            System.out.println("***************");

            numpositive_1(10);
            System.out.println("***************");

            System.out.println("«адание 3 -> " + numpositive_2(-30));
            System.out.println("***************");

            printString("ƒобрый день", 5);
            System.out.println("***************");

            int currentYear = 1986;
            System.out.println("«адание 5 -> " + "Year " + currentYear + " is leap year? " + isleapYear(currentYear));
            System.out.println("******-Done-******");
        }

    // 1. Ќаписать метод, принимающий на вход два целых числа и провер€ющий,
// * что их сумма лежит в пределах от 10 до 20 (включительно), если да Ц вернуть true,
// * в противном случае Ц false.
    public static boolean summ(int a, int b) {
           return ((a + b)>=10 && (a + b)<=20);
        }

// 2. Ќаписать метод, которому в качестве параметра передаетс€ целое число,
// * метод должен напечатать в консоль, положительное ли число передали или отрицательное.
// * «амечание: ноль считаем положительным числом.
//
    public static void numpositive_1(int variable) {
         if (variable >= 0) {
             System.out.println("«адание 2 -> " + variable + " is positive");
         } else {
             System.out.println("«адание 2 -> " + variable + " is negative");
         }
}
//* 3. Ќаписать метод, которому в качестве параметра передаетс€ целое число.
//  * ћетод должен вернуть true, если число отрицательное, и вернуть false если положительное.

    public static boolean numpositive_2(int variable) {
        return variable <= 0;
    }

//  * 4. Ќаписать метод, которому в качестве аргументов передаетс€ строка и число,
//  * метод должен отпечатать в консоль указанную строку, указанное количество раз;

    public static void printString(String value, int count) {
        for (int i = 1; i <= count; i++) {
            System.out.println("«адание 4 -> " + "String #" + i + ": " + value);
        }
    }

//  5.* Ќаписать метод, который определ€ет, €вл€етс€ ли год високосным,
//  и возвращает boolean (високосный - true, не високосный - false).
//  *  аждый 4-й год €вл€етс€ високосным, кроме каждого 100-го, при этом каждый 400-й Ц високосный.

    public static boolean isleapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }
}
