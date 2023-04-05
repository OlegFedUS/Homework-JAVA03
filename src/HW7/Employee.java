package HW7;

public class Employee extends Person{

    private int salary;

    public Employee(String name, int age, char gender, int salary) {
        super(name, age, gender);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean isSameName(Employee employee){
        return employee.getName().equals(super.getName());
    }

}
