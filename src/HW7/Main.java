package HW7;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("Van", 69, 'M');
        System.out.println(person.getName());

        Employee employee1 = new Employee("Billy", 96, 'M', 4000);
        Employee employee2 = new Employee("Lisa", 15, 'W', 9000);

        System.out.println(employee1.isSameName(employee2));

        Employee[] employees = {employee1, employee2};

        System.out.println(Salary.getSum(employees));


    }
}
