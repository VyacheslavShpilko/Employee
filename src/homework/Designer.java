package homework;

public class Designer implements Employee {

    private static String name;
    static String surname;
    private static String department;
    private static double salary;
    private static String designSpecialization;

    public Designer(String name, String surname, String department, double salary, String designSpecialization) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
        this.designSpecialization = designSpecialization;

    }

    public Designer() {

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
