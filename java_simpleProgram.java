package Core_Java;

public class java_simpleProgram {

	public static void main(String[] args) {
		//Fibonacci series
		System.out.println("Fibonacci series");
		int n1=0; // Fibonacci series always starts with = 0
		int n2=1;  //Fibonacci series second number is = 1
		int count=10; // limit of the number (condition)
		int n3,i;   // declare the variable (to create the memory)
		System.out.println(+n1+" "+n2);
		for(i =2;i<count;i++) {  // we already print n1 &n2 so that loop will start from 2
			n3 = n1+n2;
			//System.out.print("n"+i+" value ");
			System.out.println( +n3);
			n1=n2;   //n2 value is assigning to the n1			
			n2=n3;   //n3 value is assigning to the n2
			
		}
		
		
		//Factorial Program
		System.out.println("Factorial Program");
		int j;
		int fact=1;
		int number=6;  // it is the number to calculate factorial
		for(j=1;j<=number;j++) {
			fact = j*fact;
			
		}
		System.out.println("factorial of "+number+" is "+fact);
		//Find Largest of Three number
		System.out.println("Find Largest of Three number");
		double d1=-4.5,d2=3.9,d3=4.5;  // Variable having same data type so we can write same line  by using comma operator
		if((d1>=d2)&&(d1>=d3)) {     //Condition for checking the value whether d1 is largest or not
			System.out.println(d1 + " is the largest number");
		}
		else if((d2>=d1)&&(d2>=d3)) { //Condition for checking the value whether d2 is largest or not
			System.out.println(d2 + " is the largest number");
		  }
	
	    else {
				System.out.println(d3 + " is the largest number");
			}
		
		//Reverse a Number 
		System.out.println("Reverse a Number ");
		int Reversenumber=2331481;  // input for the reverse number
		int  reverse=0;
		while(Reversenumber!=0) {  //condition = loop will run till the condition is false
			int remainder= Reversenumber % 10;   //modulus by 10   - it will return the remainder value 
			reverse = reverse*10 + remainder;
			Reversenumber = Reversenumber /10; // divide by 10 - it will remove the last value and return the whole number.
			
		}
		System.out.println(reverse);
		
		//Display Even number from 1-100
		System.out.println("Display Even number from 1-50"); //print the heading for even number
		//System.out.println("Display odd number from 1-50");// print the heading for odd number
		 
		int Number1=50;
		System.out.println("even number is");   // print the heading for even number
		//System.out.println("Odd number is"); // print the heading for odd number
		for(int k=1;k<=Number1;k++) {
			if(k%2 == 0) {         // condition to check the number is even, if the remainder value return 0 is even
				System.out.print(" "+k);
				
			}
			else {      // it will come whether the number is odd /if the remainder value not return 0 is odd
			 //System.out.print(" "+k);
			}
			
		}
		System.out.println();
		
		//Swap two variables
		System.out.println("Swap two variables");
		int x=50;
		int y=20;
		System.out.println("Before Swapping " + "x = " + x + " y = " + y);
		int temp =x;    // using the temporary variable 
		x=y;
		y=temp;
	    System.out.println("After Swapping " + "x = " + x + " y = " + y);
	
	}

}
