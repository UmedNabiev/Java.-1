package HomeWork5;

public class Employee {
// 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
private static final int CURRENT_YEAR = 2022;

    String FirstName;
    String FamilyName;
    String Position;
    String email;
    String PhoneNumber;
    int Salary;
    int birthYear;

// 2.	Конструктор класса должен заполнять эти поля при создании объекта;

    public Employee(String FirstName,
                    String FamilyName,
                    String Position,
                    String email,
                    String PhoneNumber,
                    int Salary,
                    int birthYear) {
        this.FirstName = FirstName;
        this.FamilyName = FamilyName;
        this.Position = Position;
        this.email = email;
        this.PhoneNumber = PhoneNumber;
        this.Salary = Salary;
        this.birthYear = birthYear;
}
// 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
    int getAge() {
        return CURRENT_YEAR - birthYear;
    }

    int getSalary() {
        return Salary;
    }

    String getHRinfo() {
        return this.FirstName + " " +
                this.FamilyName + ", is " +
                this.getAge() + " years old, " +
                this.Position + ", " +
                this.email + ", email:" +
                this.PhoneNumber + ". Salary is " +
                this.getSalary() + " Rub";
    }

}
