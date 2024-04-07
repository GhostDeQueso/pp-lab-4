public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Mateusz Ryngiewicz", 10000);
        employees[1] = new Employee("Szymon Ryngiewicz", 120000);
        employees[2] = new Employee("Małgoarzata Ryngiewicz", 14000);
        employees[3] = new Employee("Maciek Aulich", 7000);
        employees[4] = new Employee("Nikola Pająk", 20000);

        System.out.println("Paracownik o indeksie 3:");
        System.out.println(employees[3]);

        employees[3].setSalary(10000);

        
        System.out.println("\nWszyscy pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
