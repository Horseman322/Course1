public class Main {

    private static final Employee[] employees = new Employee[10];

    private static int calculateTotalSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    private static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static Employee findEmployeeWithMinSalary() {
        Employee result = employees[0];
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    private static Employee findEmployeeWithMaxSalary() {
        Employee result = employees[0];
        int maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    private static double midlSalary() {
        double sum = calculateTotalSalary();
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        sum = sum / employees.length;
        return sum;
    }


    public static void main(String[] args) {

        Employee emp1 = new Employee("Сергей", "Петрович", "Большов", 1, 80000);
        Employee emp2 = new Employee("Михаил", "Семенович", "Пальчиков", 1, 60000);
        Employee emp3 = new Employee("Светослав", "Валерьевич", "Мышенок", 1, 100000);
        Employee emp4 = new Employee("Олег", "Олегович", "Олегов", 1, 73234);
        Employee emp5 = new Employee("Павел", "Аркадьевич", "Младенцов", 1, 99999);

        employees[0] = emp1;
        employees[1] = emp2;
        employees[2] = emp3;
        employees[3] = emp4;
        employees[4] = emp5;


        System.out.println(emp1);
        System.out.println();
        System.out.println(emp2);
        System.out.println();
        System.out.println(emp3);
        System.out.println();
        System.out.println(emp4);
        System.out.println();
        System.out.println(emp5);
        System.out.println();
        System.out.println(calculateTotalSalary());
        System.out.println();
        System.out.println(findEmployeeWithMinSalary());
        System.out.println();
        System.out.println(findEmployeeWithMaxSalary());
        System.out.println();
        System.out.println(midlSalary());
        System.out.println();
    }
}