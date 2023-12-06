//Assignment Description:  
//Write a program that reads the name and salary of an employee.  The salary will be an hourly wage, such as $9.25.  
//Ask how many hours the employee worked in the past week.  Be sure to accept fractional hours.  
//Compute the pay. Any overtime work (over 40 hours per week) is paid at one-and-one-half times the hourly wage (150 percent).  Print the employee’s name and paycheck amount.

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    
    //Ask user to input name then save input under the name variable
    System.out.println("Please enter your name"); 
    String name = obj.nextLine();
    //Ask user to input the hourly wage then save input under the salary variable
    System.out.println("Please enter your hourly wage"); 
    Double salary = obj.nextDouble();
    //Ask user to input the hourly worked then save input under the hours variable
    System.out.println("How many hours have you worked in the past week"); 
    Double hours = obj.nextDouble();
    
    //Ask user to input the overtime hours worked then save input under the overtime variable
    System.out.println("Enter the amount of overtime hours you worked. If you didn't work overtime input 0.");
    Double overtime = obj.nextDouble();
    
    //create an overtimePay variable which calculates overtime salary
    Double overtimePay = 1.5 * salary;
    //set overtime variable equal to the users overtime pay which is the product of overtime pay times the overtime hours worked
    overtime = overtimePay * overtime;
    //create a conditional statement that prints a calculation for either regular pay + overtime or just regular pay based on the total hours provided in the input
    if (hours > 40) {
        System.out.println("Your name is " + name + " and your pay for the past week is $" + (salary * hours + overtime));
    }
    else 
    {
        System.out.println("Your name is " + name + " and your pay for the past week is $" + salary * hours);
    }
    obj.close();
    }
}
