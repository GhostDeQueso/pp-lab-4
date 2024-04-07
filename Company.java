import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[7];

        
        employees[0] = new Manager("Mateusz Ryngiewicz", 10000, 0);
        employees[1] = new Worker("Szymon Ryngiewicz", 120000, "CEO");
        employees[2] = new Employee("Małgoarzata Ryngiewicz", 14000);
        employees[3] = new Worker("Maciek Aulich", 7000, "Programista");
        employees[4] = new Worker("Nikola Pająk", 20000, "Specjalista");
        employees[5] = new Manager("Jan Szerman", 7000, 0);
        employees[6] = new Worker("Julia Maj", 6000, "Magazynier");
        
        
        for (Employee employee : employees) {
            employee.setSalary(employee.getSalary() + 500);
            if (employee instanceof Manager) {
                ((Manager) employee).setNumberOfSubordinates(2); 
                employee.setSalary(7500); 
            }
        }

        
        System.out.println("Zaktualizowani pracownicy:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
