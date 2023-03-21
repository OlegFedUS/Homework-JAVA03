package HW4;

import java.util.Arrays;

public class Task1 {

    /*
    Задача №1

Дан массив:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо вывести сумму всех значений массива.

     */
    public static void main(String[] args) {


        int num = 0;

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        for (int i = 0; i < array.length; i++){
            num += array[i];
        }

        System.out.println(num);


        System.out.println("///////////////////////////////////////");
        /*
        Задача №2

Дан массив:
int[] array2 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо вывести максимальное значение массива.

         */


        int[] array2 = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        int arr = array2[0];


        for(int i = 0; i < array2.length; i++){
            if (arr < array2[i]){
                arr = array2[i];
            }
        }

        System.out.println(arr);

        System.out.println("///////////////////////////////////");

        /*
        Задача №3

Дан массив:
int[] array3 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо вывести минимальное значение массива.

         */

        int[] array3 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int arr3 = array3[0];

        for (int i = 0; i < array3.length; i++){
            if (arr3 > array3[i]){
                arr3 = array3[i];
            }
        }
        System.out.println(arr3);
        System.out.println("////////////////////////////////");

        /*
        Задача №4

Дан массив:
int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
необходимо вывести среднее арифметическое всех значений массива.


         */

        int num4 = 0;

        int[] array4 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < array4.length; i++){
            num4 += array4[i];
        }

        num4 = num4 / 9;
        System.out.println(num4);
        System.out.println("///////////////////////////////");

        /*

Задача №5

Дан массив:
int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
необходимо вывести сумму элементов массива.

         */

        int[][] array5 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int num5 = 0;

        for (int i = 0; i < array5.length; i++){
            for (int j = 0; j < array5[i].length; j++){
                num5 += array5[i][j];
            }
        }

        System.out.println(num5);
        System.out.println("//////////////////////////");

        /*

        Задача №6

Дан массив:
int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
необходимо вывести максимальное значение массива.

         */

        int[][] array6 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int arr6 = array6[0][0];

        for (int i = 0; i < array6.length; i++){
            for (int j = 0; j < array6[i].length; j++){
                if (arr6 < array6[i][j]){
                    arr6 = array6[i][j];
                }
            }
        }

        System.out.println(arr6);

        System.out.println("/////////////////////////////////////");

        /*

Задача №7

Дан массив:
int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
необходимо вывести количество элементов в массиве.


         */

        int[][] array7 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int arr7 = 0;

        for (int i = 0; i < array7.length; i++) {
                arr7 += array7[i].length;
        }

        System.out.println(arr7);

    }
}