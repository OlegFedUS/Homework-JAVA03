package HW8;

public class Main {

    public static void main(String[] args) {


        Manager manager = new Manager("Billy Herrington", 69, 'M', 4000, 8);

        int finalNumber = manager.getSalary(30);


        System.out.println(" Name: " + manager.getName() + "\n " + "Age: " + manager.getAge() +
                "\n " + "Gender: " + manager.getGender() + "\n " + "Salary per Day: " +
                manager.getDaySalary() + "\n " + "Number of Workers: " + manager.getWorkers() + "\n "
                + "Total Salary: " + finalNumber);

    }
}
