package HomeWork5;

public class Employee {
// 1. Create class "Employee" with fields: Full name, Position, email, Phone number, Salary, Age.
private static final int CURRENT_YEAR = 2022;

    String FirstName;
    String FamilyName;
    String Position;
    String email;
    String PhoneNumber;
    int Salary;
    int birthYear;

// 2.	The class constructor should fill in these fields when the object is created;

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
// 3. Within the class "Employee" write a method, which will display the information about the object in console.
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
