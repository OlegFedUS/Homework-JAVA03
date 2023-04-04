package HW8a;

public class Employee {

    private String name;
    private int baseSalary;

    public Employee(){
        System.out.println("Employee");
    }

    public Employee(String name){
        this();
        System.out.println("Huy");
        this.name = name;
    }

    public Employee(String name, int baseSalary){
        this();
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName(){
        return name;
    }

    public int getBaseSalary(){
        return baseSalary;
    }




}
