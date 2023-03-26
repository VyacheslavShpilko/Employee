package homework;

public class Manager implements Employee {
    static String name;
    static String surname;
    private static String department;
    private static double salary;
    private static int[] subordinates = new int[]{};

    public Manager(String name, String surname, String department, double salary, int [] subordinates) {
        this.name = name;
        this.surname = surname;
        this.department=department;
        this.salary = salary;
        this.subordinates = subordinates;
    }

    public Manager(Manager manager) {

    }


    public static int[] getSubordinates() {
        return subordinates;
    }

    @Override
    public void getFullName() {
        System.out.println(name + " "+ surname);

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
