//Write a program where a for loop prompts the user to enter five integers, one at a time.  
//The program will print the sum and the product of the entered integers.

import java.util.Scanner;

public class Assignment4 {
    public static void main (String[] args) {
        
        Scanner obj = new Scanner(System.in);

        //initialize variable sum equal to 0
        int sum = 0;
        //initialize variable product equal to 1
        int product = 1;

        //prompt the user to enter five integers
        System.out.println("Enter five integers");

        //create a for loop that iterates five times
        for (int i = 0; i < 5; i++) {
            //take a user's input and save it in the variable input
            int input = obj.nextInt();
            
            //add each inputted number to the variable sum, providing the sum of all numbers
            sum += input;

            //multiply each input by the previous input, providing the product of all integers
            product *= input;
            

        }

        //Print the sum
        System.out.println("The sum is " + sum);
        
        //Print the product
        System.out.println("The product is " + product);



    }
    
}
