//Assignment Description: 
//A supermarket awards coupons depending on how much a customer spends on groceries.  For example, spending $50 will get a coupon worth eight percent of the amount.
//Write a program that calculates and prints the coupon value a person can receive based on the amount of groceries purchased.

import java.util.Scanner;

public class Assignment2 {

    public static void main(String[] args) {

    Scanner obj = new Scanner(System.in);
    
    //Enter how much you spent on groceries and save that as the variable amountSpent
    System.out.println("Enter how much you spent on groceries"); 
    Double amountSpent = obj.nextDouble();

    //if/else statement to print coupon value, if any, based on the amountspent
    if (amountSpent < 10) {
        System.out.println("You have no coupon");
    }

    else if (amountSpent >= 10 && amountSpent <= 60)
    {
        System.out.println("Your coupon value is $" + (.08 * amountSpent));
    }
    else if (amountSpent > 60 && amountSpent <= 150)
    {
        System.out.println("Your coupon value is $" + (.10 * amountSpent));
    }
    else if (amountSpent > 150 && amountSpent <= 210)
    {
        System.out.println("Your coupon value is $" + (.12 * amountSpent));
    }
    else
    {
        System.out.println("Your coupon value is $" + (.14 * amountSpent));
    }

    obj.close();
    }
}
