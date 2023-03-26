package homework;

public class Program {
    public static void main(String[] args) {
        Manager manager = new Manager("Ivan", "Ivanov", "First", 56000, Manager.getSubordinates());
        Designer designer = new Designer("Ivan", "Petrov", "Two", 59000, "Photo");
        Developer developer = new Developer("Ivan", "Sidorov", "Three", 66000, "Java");
        Employee[] person = new Employee[]{
                new Manager(), new Designer(), new Developer(),
        };

        for (Employee person1 : person) {
            person1.getFullName();
            person1.getDepartment();
            person1.getSalary();
        }
    }

}
