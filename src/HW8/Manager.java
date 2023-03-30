package HW8;

public class Manager extends Employee{

    private int workers;

    public Manager(String name, int age, char gender, int daySalary, int workers){
        super(name, age, gender, daySalary);
        this.workers = workers;
    }

    public int getWorkers() {
        return workers;
    }

    public void setWorkers(int workers) {
        this.workers = workers;
    }

    public int getSalary(int days){
        int salary = getDaySalary() * days;
        return (int) (salary + salary * (getWorkers() / 100.0));
    }

}
