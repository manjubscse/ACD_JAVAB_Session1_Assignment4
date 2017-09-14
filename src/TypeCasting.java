// Importing the Scanner class used for taking input from user
import java.util.Scanner;
public class TypeCasting {

	//main method of class Typecasting
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b; 	// Declare variable type byte
		short s; 	// Declare variable type byte
		int i; 		// Declare variable type byte
		long l; 	// Declare variable type byte
		double d;  	// Declare variable type byte
		float f; 	// Declare variable type byte
		
		//Initiating the Scanner object for taking input from user
	    Scanner in =new Scanner(System.in);
	    
	    //Printing message for user 
	    System.out.println("Enter the byte value for b :");
	    b=in.nextByte(); // Asking for input from user of type byte
	    
	    //Printing message for user 
	    System.out.println("Enter the short value for s :");
	    s=in.nextShort(); // Asking for input from user of type short
	    
	    //Type casting of byte and short and stored the sum to integer
		i=b+s;
		// Printing the result of integer value
	    System.out.println("Sum of byte b and short s stored in int i is: "+i);
	    
	    //Type casting of short and integer and stored the sum to long
	    l=i+s;
	    //Printing the result of long value
	    System.out.println("Sum of short s and int i stored in long l is : "+l);
	    
	    //Type casting of integer and long and stored the sum to float
	    f=(l+i); 
	    //Printing the result of float value
	    System.out.println("Sum of int i and long l stored in float f is "+f);
	    
	    //Type casting of long and float and stored the sum to double
	    d=f+l;
	    //Printing the result of double value
	    System.out.println("Sum of long l and float f stored in double d is  "+d);
	    
	    in.close(); // Close the Object of Scanner
	}

}
