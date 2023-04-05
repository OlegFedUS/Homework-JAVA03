package HW9;

import java.security.PublicKey;

public class Worker extends Employee {



    public Worker(String name, int baseSalary){
        super(name, baseSalary);
    }


    public int getSalary(){
        return getBaseSalary();
    }



}
