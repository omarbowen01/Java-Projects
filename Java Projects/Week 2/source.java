//import java.util.Scanner;

public class source {
    public static void main(String[] args)
    {
        int i;
        int j;
        int k;

        //create the rows
        for (i = 0; i <= 10; i++)
        {
            //create the columns, taking away the first asterisk in each column continuously
            for (j = 0; j < i; j++) {
                System.out.print("*" + " ");
            }
            //print shape
            System.out.println();
        }
        //print space between this shape and next
        System.out.println();

        //create rows
        for (i = 0; i <= 10; i++)
        {
            //create columns decrementing one asterisk each time from bottom to top
            for (j = 10; j > i; j--) {
                System.out.print("*" + " ");
            }

            //print shape
            System.out.println("");

        }
        //print space between this shape and next
        System.out.println();

        //create rows
        for (i= 0; i<= 10; i++) {
            //put a new space with each column
            for (k = 0; k < i; k++) {
                System.out.print(" ");
            }
            //print asterisks for each column
            //10 -i prints the respective number of asterisks for each row
            for (j =0 ; j< 10- i; j++){ 
                System.out.print("*");
            }
            //print shape
            System.out.println();
            
        }
        //print space between this shape and next
        System.out.println();

        //initialize row to 10
        int row = 10;
        //create riws
        for (i = 0; i <= row; i++) {
            //print the space for each row
            //each row has less and less spaces as it increments creating more asterisks
            for (j = 0; j <= row - i; j++) {
            System.out.print(" ");
            }
            //print asterisk in each row
            for (k = 0; k < i; k++) {
            System.out.print("*");
            }
            //print shape
            System.out.println();
        }


}
}