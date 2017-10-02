/**
 * 
 */
package Assignment_4;																			// Package declared
import java.util.Scanner;																		// This will import the Scanner class
/**
 * Write a program to find the aliquot sum of a given number. 
 *	
 * Hint: The aliquot divisors of a number are all its divisors except the number itself. The aliquot sum is the sum of the aliquot divisors. 
 * For example, the aliquot divisors of 12 are 1, 2, 3, 4, and6 and its aliquot sum is 16. 
 * Extend this program to check if given number is a perfect number or not. 
 * If a number equals to its aliquot sum, then it is a perfect number. Print all perfect numbers between 1 to 100.
 * 
 * All the comments in the program will be placed on the Right-Hand-Side.
 * @author Sahil Khurana <sahilkhurana369@gmail.com>
 */
public class Assignment_4_4 {																	// Class Declared			
	public static void main(String[] args) {													// main method Started
		Scanner userInput = new Scanner(System.in);												// Initialize the scanner to get input from User
        System.out.print("\nEnter Any Integer : ");												// This will print the integer in the next line
        long Input = userInput.nextLong();														// Read input long variable Input from the User
        long sum = 1;																			// variable sum is declared and assigned the value 1
        System.out.print("Divisors of " + Input + " = 1,");										// Read input long variable Input from the User
        for (long myLongVariable = 2; myLongVariable <= Math.sqrt(Input); myLongVariable++) {	// for loop expression
            if (Input % myLongVariable == 0) {													// if loop expression
                System.out.print(myLongVariable + ",");											// This will print the integer in the next line
                if (myLongVariable != Input / myLongVariable) {									// nested if loop expression
                    System.out.print(Input / myLongVariable + ",");}							// This will print the integer in the next line
                if (Input / myLongVariable == 0) {												// nested if loop expression
                    sum += myLongVariable;														// variable sum is assigned a value 
                } else {																		// else loop 
                    sum += (myLongVariable + Input / myLongVariable);}							// variable sum is assigned a value
            }																					// if loop closed
        }																						// for loop closed							
        System.out.println("\nThe Aliquot Sum of " + Input + " is : " + sum);					// This will print the integer in the next line
        userInput.close();																		// scanner input variable closed
        if (sum == Input) {																		// sum is assigned a value equal to input
            System.out.println("\n" + Input + " is a perfect number.");							// This will print the integer in the next line
            new PerfectNumber();																// new declared to call method PerfectNumber()
        } else {																				// else loop				
            System.out.println("\n" + Input + " is not a perfect number."); }					// This will print the integer in the next line
     }																							// Main method closed	
}																								// Assignment_4_4 class closed
