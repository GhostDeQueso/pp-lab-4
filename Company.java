import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        
        employees[0] = new Manager("Mateusz Ryngiewicz", 10000, 0);
        employees[1] = new Worker("Szymon Ryngiewicz", 120000, "Deweloper");
        employees[2] = new Employee("Małgoarzata Ryngiewicz", 14000);
        employees[3] = new Worker("Maciek Aulich", 7000, "Księgowy");
        employees[4] = new Worker("Nikola Pająk", 20000, "Menedżer marketingu");

        
        System.out.println("Wszyscy pracownicy:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
