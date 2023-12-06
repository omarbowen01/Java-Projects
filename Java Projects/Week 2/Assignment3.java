//Assignment Description: Input an integer number and compute the sum of the number’s odd digits.
//Write a program in which a while loop is used to compute the sum.
//For example, if the input is 32677, the sum would be 3 + 7 + 7 = 17.  The program will prompt the user to enter the integer and display the sum of all odd digits.

import java.util.Scanner;

public class Assignment3 {
    
    public static void main (String[] args) {

        Scanner obj = new Scanner(System.in);

        //prompt the user to enter a number then save it in the variable number
        System.out.println("Enter a number");
        int number = obj.nextInt();

        //initialize the sum to zero
        int sum = 0;
        
        while (number >0) {
           
            //get last digit of the number inputted and store it in the variable rem
            int rem = number%10;
                
                //if that number is odd then add it to sum 
                if (rem %2 != 0) {

                    sum = sum + rem;   
            }   
                //set number equal the rest of the digits EXCEPT for the last one
                //while loop while continue to iterate through the remaining digits and print out the sum of odd numbers if present
                number = number/10;
        }

        //print the sum of the odd numbers
        System.out.println("The sum of all the odd digits is " + sum);




        obj.close();




    }
}
