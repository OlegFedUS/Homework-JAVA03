package HW7;

public class Salary extends Employee{

    public Salary(String name, int age, char gender, int salary) {
        super(name, age, gender, salary);
    }

    public  static int getSum(Employee[] employeeArray){
        int sum = 0;
        for (int i = 0; i < employeeArray.length; i++){
            sum += employeeArray[i].getSalary();
        }
        return sum;
    }

}
