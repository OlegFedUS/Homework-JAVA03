package HW8a;

public class Manager extends BaseManager{

    public Manager(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
    }

    @Override
    public int getSalary() {
        if (getNumberOfSubordinates() > 0) {
            return (int) (getBaseSalary() * (getNumberOfSubordinates() / 100.0 * 3));
        } else {
            return super.getSalary();
        }

    }
}
