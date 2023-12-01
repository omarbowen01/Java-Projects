import java.util.Scanner;

public class HWAssigment2_2 {
    
    public static void main (String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter an integer number between 1 - 1000");
        int number = obj.nextInt();

        int sum = 0;
        
        while (number >0) {
            int rem = number%10;
                if (rem %2 != 0) {

                    sum = sum + rem;   
            }
                number = number/10;
        }

        System.out.println("The sum of all the odd digits is " + sum);




        obj.close();




    }
}
