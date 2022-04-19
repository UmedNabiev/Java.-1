package HomeWorkAPP_UN2;

public class HomeWork_2 {

        public static void main(String[] args) {
            System.out.println("������� 1 -> " + summ(10, 9));
            System.out.println("***************");

            numpositive_1(10);
            System.out.println("***************");

            System.out.println("������� 3 -> " + numpositive_2(-30));
            System.out.println("***************");

            printString("������ ����", 5);
            System.out.println("***************");

            int currentYear = 1986;
            System.out.println("������� 5 -> " + "Year " + currentYear + " is leap year? " + isleapYear(currentYear));
            System.out.println("******-Done-******");
        }

    // 1. �������� �����, ����������� �� ���� ��� ����� ����� � �����������,
// * ��� �� ����� ����� � �������� �� 10 �� 20 (������������), ���� �� � ������� true,
// * � ��������� ������ � false.
    public static boolean summ(int a, int b) {
           return ((a + b)>=10 && (a + b)<=20);
        }

// 2. �������� �����, �������� � �������� ��������� ���������� ����� �����,
// * ����� ������ ���������� � �������, ������������� �� ����� �������� ��� �������������.
// * ���������: ���� ������� ������������� ������.
//
    public static void numpositive_1(int variable) {
         if (variable >= 0) {
             System.out.println("������� 2 -> " + variable + " is positive");
         } else {
             System.out.println("������� 2 -> " + variable + " is negative");
         }
}
//* 3. �������� �����, �������� � �������� ��������� ���������� ����� �����.
//  * ����� ������ ������� true, ���� ����� �������������, � ������� false ���� �������������.

    public static boolean numpositive_2(int variable) {
        return variable <= 0;
    }

//  * 4. �������� �����, �������� � �������� ���������� ���������� ������ � �����,
//  * ����� ������ ���������� � ������� ��������� ������, ��������� ���������� ���;

    public static void printString(String value, int count) {
        for (int i = 1; i <= count; i++) {
            System.out.println("������� 4 -> " + "String #" + i + ": " + value);
        }
    }

//  5.* �������� �����, ������� ����������, �������� �� ��� ����������,
//  � ���������� boolean (���������� - true, �� ���������� - false).
//  * ������ 4-� ��� �������� ����������, ����� ������� 100-��, ��� ���� ������ 400-� � ����������.

    public static boolean isleapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }
}
