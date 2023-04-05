package HW7;

public class Person extends BasePerson {

    public Person(String name, int age, char gender) {
        super(name, age, gender);
    }

    @Override
    public String getName() {
        if (getGender() == 'M') {
            return "Mr." + super.getName();
        } else if (getGender() == 'W')
            return "Ms." + super.getName();
        return null;
    }

}
