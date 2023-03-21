package HW5;

public class Task2 {

    public static void main(String[] args) {

        /*
        for (int i = 0; i <= 9; i++){
            for (int j = 9; j > i; j--) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }

        System.out.println("");

         */
        ///////////////////////////////////////////////


        for (int i = 10; i >= 0; i--){
            for (int j = 10; j > i; j--){
                System.out.print(" ");
            }

            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }


    }
}
