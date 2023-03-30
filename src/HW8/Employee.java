package HW8;

public class Employee extends BaseEmployee{

    public Employee(String name, int age, char gender, int daySalary){
        super(name, age, gender, daySalary);
    }

    public int getSalary(int days){
        return getDaySalary() * days;
    }
    
}
