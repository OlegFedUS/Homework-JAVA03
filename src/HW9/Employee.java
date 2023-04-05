package HW9;

public class Employee {

    private String name;
    private int baseSalary;

    public Employee(){
        System.out.println("Employee Information: ");
    }

    public Employee(String name, int baseSalary) {
        this();
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

}
