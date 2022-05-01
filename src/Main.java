public class Main {
    public static void main(String[] args) {

        //создания объекта employeeService с методами
        EmployeeService employeeService = new EmployeeService();

        //создание массива
        Employee[] storage = new Employee[10];

        //создание объектов
        storage[0] = new Employee("Jack McDonnell Sharp", 1, 250_000);
        storage[1] = new Employee("Mitchell Folk James", 4, 433_000);
        storage[2] = new Employee("Lester John Daniels", 2, 201_032);
        storage[3] = new Employee("Amie Van Dyke", 1, 136_513);
        storage[4] = new Employee("Margaret join Voice", 5, 148_519);
        storage[5] = new Employee("Miley Jane Citrus ", 3, 129_549);
        storage[6] = new Employee("Jane Shellie Foster", 1, 463_148);
        storage[7] = new Employee("Bryce Alan Wayne", 2, 621_196);
        storage[8] = new Employee("Kent James Clark", 4, 123_589);
        storage[9] = new Employee("Barry Speedster Allen", 5, 200_002);



        //вызов методов
        employeeService.listOfEmployees(storage);
        System.out.println("Total costs is " + employeeService.totalCost(storage));
        employeeService.interval();
        employeeService.employeeMinimumWage(storage);
        employeeService.employeeMaximumWage(storage);
        employeeService.averageSalary(storage);
        employeeService.listOfNames(storage);


    }








}


