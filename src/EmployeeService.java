public class EmployeeService {

    public void interval() {
        System.out.println("//////");
    }

    //список всех сотрудников
    public void listOfEmployees(Employee[] storage) {
        for (int i = 0; i < 10; i++) {
            System.out.println(storage[i].toString());
        }
        interval();
    }

    // общие расходы на ЗП
    public double totalCost(Employee[] storage) { //реализовал таким образом для наглядности возможности реализации методов различными способами
        double sum = 0;
        for (int i = 0; i < storage.length - 1; i++) {
            sum += storage[i].getSalary();
        }
        return sum;
    }

    //средняя ЗП
    public void averageSalary(Employee[] storage) {
        double sum = totalCost(storage) / storage.length; //Здесь и используется преимущество иной реализации метода totalCost
        System.out.println("Average salary is " + sum);
        interval();
    }

    // сотрудник с минимальной ЗП
    public void employeeMinimumWage(Employee[] storage) {
        double sum = storage[0].getSalary();
        int a = 0;
        for (int i = 0; i < storage.length - 1; i++) {
            if (storage[i].getSalary() < sum) {
                sum = storage[i].getSalary();
                a = i;
            }
        }
        System.out.println("Employee Minimum Wage - " + storage[a].getUserName() + " with salary - " + sum);
        interval();
    }
    // сотрудник с максимильной ЗП
    public void employeeMaximumWage(Employee[] storage) {
        double sum = storage[0].getSalary();
        int a = 0;
        for (int i = 0; i < storage.length - 1; i++) {
            if (storage[i].getSalary() > sum) {
                sum = storage[i].getSalary();
                a = i;
            }
        }
        System.out.println("Employee Maximum Wage - " + storage[a].getUserName() + " with salary - " + sum);
        interval();
    }

    //список сотрудников поимённо
    public void listOfNames(Employee[] storage) {
        for (int i = 0; i < storage.length - 1; i++) {
            System.out.println(storage[i].getUserName());
        }
        interval();
    }

}
