package Assignment_4;														// Package declared

public class PerfectNumber {												// Class declared
    public PerfectNumber() {												// constructor created
        int myInteger, sum = 1;												// integer variable declared and sum assigned the value 1
        System.out.print("Perfect Numbers between 1 to 100 are 1,");		// This will print the argument at the end of the line
        for (int integerRange = 2; integerRange <= 100; integerRange++)		// for loop expression for the range of the integer	
        {sum = 1;															// variable sum is assigned value 1
            for (myInteger = 2; myInteger < integerRange; myInteger++)		// nested for loop for perfect numbers 
            {if (integerRange % myInteger == 0)								// if loop where condition equal to zero
                    sum = sum + myInteger;}									// Sum variable is assigned a value
            if (integerRange == sum)										// if loop where condition equal to sum
                System.out.print(integerRange + ",");}						// This will print the argument at the end of the line
        return;																// return nothing
    }																		// constructor closed
}																			// PerfectNumber class closed