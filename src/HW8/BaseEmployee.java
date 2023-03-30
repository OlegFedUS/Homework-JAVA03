package HW8;

public class BaseEmployee {

    private String name;
    private int age;
    private char gender;
    private int daySalary;

    public BaseEmployee(String name, int age, char gender, int daySalary){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.daySalary = daySalary;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public char getGender(){
        return gender;
    }

    public void setGender(char gender){
        this.gender = gender;
    }

    public int getDaySalary(){
        return daySalary;
    }

    public void setSalary(int daySalary){
        this.daySalary = daySalary;
    }


}
