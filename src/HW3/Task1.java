package HW3;

import java.util.Random;

public class Task1 {

    public static void main(String[] args) {

        /*
        Задача №1
Необходимо создать две целочисленные переменные (a, b), присвоить произвольные значения переменным на ваш выбор и вывести следующие строки:
a == b - если переменные равны
a < b - если переменная a меньше b
a > b - если переменная b меньше a
         */

        int a1;
        int b1;

        Random randomNumber = new Random();
        a1 = randomNumber.nextInt(10);
        b1 = randomNumber.nextInt(10);

        System.out.println(a1 == b1);
        System.out.println(a1 < b1);
        System.out.println(a1 > b1);

     /*
     Задача №2

Необходимо создать две целочисленные переменные (a, b), присвоить произвольные значения переменным на ваш выбор и вывести следующие строки:
maybe a and b are even - если сумма переменных четная
some variable is odd - если сумма переменных нечетная
      */

        int a2;
        int b2;

        a2 = 10;
        b2 = 5;

        if ((a2 + b2) % 2 == 0) {
            System.out.println("maybe a and b are even");
        } else if ((a2 + b2) % 2 != 0) {
            System.out.println("some variable is odd");
        }

        /*
        Задача №3

        Необходимо создать целочисленную переменную, присвоить произвольное значение переменной на ваш выбор и вывести следующие строки:
        больше 10 - если переменная больше 10
        меньше 100 - если переменная меньше 100
        результат деления на 2 больше 20 - если это соответствует истине
        значение переменной между 5 и 40 включительно - если это правда
        значение переменной меньше 5 или больше 40 - если предыдущие условие ложное
         */

        int a3;
        a3 = 31;

        if (a3 > 10) {
            System.out.println("больше 10 - если переменная больше 10");

            if (a3 < 100) {
                System.out.println("меньше 100 - если переменная меньше 100");

                if ((a3 / 2) > 20) {
                    System.out.println("результат деления на 2 больше 20 - если это соответствует истине");

                    if ((a3 >= 5) && (a3 <= 40)) {
                        System.out.println("значение переменной между 5 и 40 включительно - если это правда");
                    } else if ((a3 < 5) || (a3 > 40)) {
                        System.out.println("значение переменной меньше 5 или больше 40 - если предыдущие условие ложное");
                    }


                }
            }
        }
    }
}
