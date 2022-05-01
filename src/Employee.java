public class Employee {

    private final String userName;
    private int department;
    private double salary;
    public static int id = 0;


    //конструктор
    public Employee(String userName, int department, int salary) {
        this.userName = userName;
        this.department = department;
        this.salary = salary;
        id++;
    }

    //геттеры
    public String getUserName() {
        return userName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    //сеттеры

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    // метод toString
    @Override
    public String toString() {
        return "Employee name - " + userName + ", department - " + department + ", salary - " + salary;
    }
}
