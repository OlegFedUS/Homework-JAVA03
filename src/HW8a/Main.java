package HW8a;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        /*
        BaseManager manager = new BaseManager("Vachtang Dudaev", 14000, 3000);
        System.out.println(" BaseManager Name: " + manager.getName() + "\n " + "Total Salary: " + manager.getSalaryManager());

        System.out.println();

        Director director = new Director("Mambek Magametov", 14000, 3000);
        System.out.println(" SEO Name: " + director.getName() + "\n " + "Total Salary: " + director.getSalaryDirector());

        System.out.println();

        Employee[] employees = {new Employee("Ivan Pizdorvan", 1000)};

        Director[] directors = {new Director("Gatilla", 6666, 1488)};

        EmployeeUtils company = new EmployeeUtils();
        System.out.println(company.findName("Eblan Pizdorvan", employees));
        System.out.println(company.findName("Gatilla", directors));

        System.out.println(company.maxSalary(directors));


        System.out.println(company.totalSalary(directors));

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");


         */


        Worker workerR = new Worker("Pipka", 1000);
        Manager managerR = new Manager("Coco", 2000, 5);
        //BaseManager baseManagerR = new BaseManager("Lalka", 3000, 200);


        Worker[] workerArr = {workerR, managerR};

        String[] arrStr = new String[workerArr.length];

        for (int i = 0; i < arrStr.length; i++){
            arrStr[i] = workerArr[i].getName();
        }

        System.out.println(Arrays.toString(arrStr));



        System.out.println(workerR.getSalary());
        System.out.println(managerR.getSalary());

        System.out.println();
        System.out.println(EmployeeUtils.totalSalary(workerArr));

        Employee employeeX = new Employee("Goyda", 3000);

        Worker j = new Worker("abc", 123);
        Manager g = new Manager("abc", 123, 1);

        j = g;

    }
}
