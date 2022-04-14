package HomeWorkApp_UN;

public class HomeWorkApp_UN {
    public static void main(String[] args) {
//        System.out.print("Hello world!");}
    printThreeWords();
    checkSumSign();
    printColor();
    compareNumbers();
}

   public static void printThreeWords() {
        System.out.println ("Orange");
        System.out.println("Banana");
        System.out.println("Apple");}

    public static void checkSumSign() {
        int a = 25;
        int b = -29;
        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");}
        else {System.out.println("Сумма отрицательная");}
    }

    private static void printColor() {
        int value = 125;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }
    }
    private static void compareNumbers() {
        int a = 25;
        int b = 23;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
        }
    }
