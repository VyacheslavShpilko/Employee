package homework;

public class Developer implements Employee {

    static String name;
    static String surname;
    private static String department;
    private static double salary;
    private static String programmingLanguage;

    public Developer(String name, String surname, String department, double salary, String programmingLanguage) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
        this.programmingLanguage = programmingLanguage;
    }


    public Developer() {

    }

    @Override
    public void getFullName() {
        System.out.println(name + " " + surname);

    }

    @Override
    public void getDepartment() {
        System.out.println(department);
    }

    @Override
    public void getSalary() {
        System.out.println(salary);
    }
}

