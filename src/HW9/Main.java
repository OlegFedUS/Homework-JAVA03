package HW9;

public class Main {

    public static void main(String[] args) {

        Worker worker = new Worker("Kazua", 4000);
        Manager manager = new Manager("Billy", 6000, 10);
        Director director = new Director("Van", 1000, 5);


        Worker[] workers = {worker, manager, director};
        BaseManager[] managers = {manager, director};

        System.out.println(worker.getSalary());
        System.out.println(manager.getSalary());
        System.out.println(director.getSalary());

        System.out.println();

        System.out.println(EmployeeUtils.minManagersSalary(managers));
        System.out.println(EmployeeUtils.maxManagersSalary(managers));

        System.out.println();







    }
}
