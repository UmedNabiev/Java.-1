package HomeWork5;

public class HR {
    public static void main(String[] args) {

        Employee mainEmployee = new Employee("Umed", "Nabiev",
                "Data analyst", "nabiev-u@mail.ru",
                "8 (927) 555-44-33", 60000, 1986);

// 4. Создать массив из 5 сотрудников.
        Employee[] office = {
                mainEmployee,
                new Employee("Ivan", "Ivanov",
                        "Manager", "iivanov@mail.ru",
                        "8(927)555-44-11", 50000, 1990),
                new Employee("Marina", "Marieva",
                        "Accountant", "mmarieva@mail.ru",
                        "8(927)555-44-22", 140000, 1970),
                new Employee("Veronika", "Smirnova",
                        "HR manager", "vsmirnova@mail.ru",
                        "8(927)555-44-44", 90000, 1995),
                new Employee("Petr", "Petrov",
                        "Team lead", "ppetrov@mail.ru",
                        "8(927)555-44-55", 150000, 1975)
        };

        getAllPersonsInOffice(office);
        System.out.println("***************");
        getOldPerson(office, 40);

    }
// 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет
    private static void getOldPerson(Employee[] office, int year) {
        for (int i = 0; i < office.length; i++)
            if (office[i].getAge() > year) {
                System.out.println(office[i].getHRinfo());
            }
    }

    private static void getAllPersonsInOffice(Employee[] office) {
        System.out.println("All person: ");
        for (int i = 0; i < office.length; i++)
            System.out.println((i + 1) + " " + office[i].getHRinfo());
    }
}
